package GRPC;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
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

import Models.User;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
/*
 * User server class
 * this sets up discovering and registering for JMDNS
 * starts server once index is run
 * connects via GUI
 * auto generated override/implement methods added for functionality 
 * 
 */
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


			if (event.getName().equals("User")) {
				System.out.println("Found User port: " + event.getInfo().getPort());
				try {
					userPort = event.getInfo().getPort();
					startGRPC(event.getInfo().getPort());

				} 
				catch (IOException e) {

					e.printStackTrace();
				} 
				catch (InterruptedException e) {

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

			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());


			jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
			System.out.println("Listening");

			Thread.sleep(25000);
		} 
		catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public int getUserPort() {
		return userPort;
	}

	public void setUserPort(int userPort) {
		UserServer.userPort = userPort;
	}

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {

		UserServer userServer = new UserServer();

		Server server = ServerBuilder.forPort(portNumber).addService(userServer).build().start();

		logger.info("userServer started, listening on " + portNumber);

		server.awaitTermination();
	}

	@Override
	public void initialSystem(Empty request, StreamObserver<userResp> responseObserver) {
		System.out.println("receiving initialSystem request for User ");
		String status;

		if (myUser.isOn()) {
			status = "On";
		} 
		else {
			status = "Off";

		}
		String sName = myUser.getSystemName();
		String sStatus = status;
		Integer sActivity = myUser.getActivity();

		userResp response = userResp.newBuilder().setSname(sName).setStatus(sStatus).setActivity(sActivity).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeActivity(ValRequest request, StreamObserver<ValResponse> responseObserver) {
		int currentActivity = myUser.getActivity();
		int changeActivity = request.getLength();
		System.out.println("receiving activity for user");
		int newActivity = currentActivity + changeActivity;
		if (newActivity > 10 || newActivity < 0) {
			System.out.println("Activity must be between 0-10: " + newActivity);
			System.out.println("Returning current Activity:" + myUser.getActivity());
			ValResponse response = ValResponse.newBuilder().setLength(myUser.getActivity()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} 
		else {
			System.out.println("New Activity is set :" + newActivity);
			myUser.setActivity(newActivity);
			ValResponse response = ValResponse.newBuilder().setLength(newActivity).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}

	@Override
	public void onOff(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		System.out.println("receiving onOFF for User ");
		Boolean onOff = request.getMsg();
		myUser.setOn(onOff);

		BooleanRes response = BooleanRes.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeSystemName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		String name = request.getText();
		System.out.println("Changing user name to " + name);

		myUser.setSystemName(name);

		StringResponse response = StringResponse.newBuilder().setText(name).build();
		System.out.println("Response " + response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
