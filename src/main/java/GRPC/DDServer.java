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
import org.DS.project.EBankGRPC.DDServiceGrpc.DDServiceImplBase;
import org.DS.project.EBankGRPC.Empty;
import org.DS.project.EBankGRPC.StringRequest;
import org.DS.project.EBankGRPC.StringResponse;
import org.DS.project.EBankGRPC.ValRequest;
import org.DS.project.EBankGRPC.ValResponse;
import org.DS.project.EBankGRPC.ddResp;

import Models.DD;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class DDServer extends DDServiceImplBase {
	private static final Logger logger = Logger.getLogger(DDServer.class.getName());
	public DD myDD = new DD();
	public static int ddPort;

	public static class SampleListener implements ServiceListener {

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
			if (event.getName().equals("DD")) {
				System.out.println("Found DD port: " + event.getInfo().getPort());
				try {
					ddPort = event.getInfo().getPort();
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

		public static void main(String[] args) throws IOException, InterruptedException {

			startDiscovery();

		}
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

	public int getDDPort() {
		return ddPort;
	}

	public void setDDPort(int ddPort) {
		DDServer.ddPort = ddPort;
	}

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {

		DDServer ddServer = new DDServer();

		Server server = ServerBuilder.forPort(portNumber).addService(ddServer).build().start();

		logger.info("DDServer started, listening on " + portNumber);

		server.awaitTermination();
	}

	@Override
	public void initialDD(Empty request, StreamObserver<ddResp> responseObserver) {
		System.out.println("receiving initialDD  for Direct Debits ");
		boolean status;

		if (myDD.isOn()) {
			status = true;
		} else {
			status = false;

		}
		String dName = myDD.getName();
		boolean dStatus = status;
		Integer dAmount = myDD.getAmount();

		ddResp response = ddResp.newBuilder().setDname(dName).setStatus(dStatus).setAmount(dAmount).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeAmount(ValRequest request, StreamObserver<ValResponse> responseObserver) {
		int currentAmount = myDD.getAmount();
		int changeAmount = request.getLength();

		System.out.println("receiving balance for user");
		int newAmount = currentAmount + changeAmount;

		if (newAmount <= 0) {
			System.out.println("Cannot add value less than 0");
			System.out.println("Returning current amount:" + myDD.getAmount());
			ValResponse response = ValResponse.newBuilder().setLength(myDD.getAmount()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} else {
			System.out.println("New Amount being paid is :" + newAmount);
			myDD.setAmount(newAmount);
			ValResponse response = ValResponse.newBuilder().setLength(newAmount).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}

	@Override
	public void onOff(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		System.out.println("receiving onOFF for DirectDebits ");
		Boolean onOff = request.getMsg();
		myDD.setOn(onOff);

		BooleanRes response = BooleanRes.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeDirectDebitName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		String name = request.getText();
		System.out.println("Changing Direct Debit name to " + name);

		myDD.setName(name);

		StringResponse response = StringResponse.newBuilder().setText(name).build();
		System.out.println("Response " + response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
