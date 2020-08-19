package GRPC;

import java.io.IOException;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import org.DS.project.EBankGRPC.BooleanReq;
import org.DS.project.EBankGRPC.BooleanRes;
import org.DS.project.EBankGRPC.Empty;
import org.DS.project.EBankGRPC.StringRequest;
import org.DS.project.EBankGRPC.StringResponse;
import org.DS.project.EBankGRPC.UserServiceGrpc.UserServiceImplBase;
import org.DS.project.EBankGRPC.ValRequest;
import org.DS.project.EBankGRPC.ValResponse;
import org.DS.project.EBankGRPC.userResp;

import io.grpc.stub.StreamObserver;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.User;

@SuppressWarnings("unused")
public class UserServer extends UserServiceImplBase {
	private static final Logger logger = Logger.getLogger(UserServer.class.getName());
	public User myUser = new User();
	public static int userPort;

	private static class SampleListener implements ServiceListener {

		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service added: " + event.getInfo());

		}

		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}

		public void serviceResolved(ServiceEvent event) {
			System.out.println("Service resolved: " + event.getInfo());
			System.out.println("Get Name: " + event.getName() + " PORT: " + event.getInfo().getPort());

			// Start GRPC server with discovered device
			if (event.getName().equals("User")) {
				System.out.println("Found user port: " + event.getInfo().getPort());
				try {
					userPort = event.getInfo().getPort();
					startGRPC(event.getInfo().getPort());

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		startDiscovery();

	}

	public static void startDiscovery() throws IOException, InterruptedException {
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Add a service listener
			jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
			System.out.println("Listening");
			// Wait a bit
			Thread.sleep(30000);
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {

		UserServer userServer = new UserServer();

		Server server = ServerBuilder.forPort(portNumber).addService(userServer).build().start();

		logger.info("userServer started, listening on " + portNumber);

		server.awaitTermination();
	}

	public int getUserPort() {
		return userPort;
	}

	public void setUserPort(int userPort) {
		UserServer.userPort = userPort;
	}

	@Override
	public void initialUser(Empty request, StreamObserver<userResp> responseObserver) {
		System.out.println("receiving initialDevice request for User ");
		String atype;

		if (myUser.isActiveAccount()) {
			atype = "Debit";
		} else {
			atype = "Credit";

		}
		String aName = myUser.getUserName();
		String aatype = atype;
		Integer aBalance = myUser.getBalance();

		userResp response = userResp.newBuilder().setAname(aName).setAtype(aatype).setAbalance(aBalance).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeBalance(ValRequest request, StreamObserver<ValResponse> responseObserver) {
		int currentBalance = myUser.getBalance();
		int changeBalance = request.getLength();

		System.out.println("receiving balance for user");
		int newBalance = currentBalance + changeBalance;

		if (newBalance <= 0) {
			System.out.println("Cannot add value less than 0");
			System.out.println("Returning current balance:" + myUser.getBalance());
			ValResponse response = ValResponse.newBuilder().setLength(myUser.getBalance()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} else {
			System.out.println("New balance is :" + newBalance);
			myUser.setBalance(newBalance);
			ValResponse response = ValResponse.newBuilder().setLength(newBalance).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}

	}

	@Override
	public void activeAccount(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		System.out.println("receiving activeAccount for User ");
		Boolean activeAccount = request.getMsg();
		myUser.setActiveAccount(activeAccount);

		BooleanRes response = BooleanRes.newBuilder().setMsg(activeAccount).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeAccountType(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		System.out.println("Type whether your account is a Debit or Credit account.");
		String accountType = request.getText();
		System.out.println("Changing account type to " + accountType);

		myUser.setAccountType(accountType);

		StringResponse response = StringResponse.newBuilder().setText(accountType).build();
		System.out.println("Response " + response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeAccountName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		String name = request.getText();
		System.out.println("Changing User name to " + name);

		myUser.setUserName(name);

		StringResponse response = StringResponse.newBuilder().setText(name).build();
		System.out.println("Response " + response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
