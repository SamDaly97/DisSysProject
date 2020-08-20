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

/*
 * Direct Debit server class
 * this sets up discovering and registering for JMDNS
 * starts server once index is run
 * connects via GUI
 * auto generated override/implement methods added for functionality 
 */

public class DDServer extends DDServiceImplBase {

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


			if (event.getName().equals("DD")) {
				System.out.println("Found DD port: " + event.getInfo().getPort());
				try {
					System.out.println("STARTING DD GRPC SERVER");
					startGRPC(event.getInfo().getPort());
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	private static final Logger logger = Logger.getLogger(DDServer.class.getName());
	public DD myDD = new DD();

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

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		DDServer ddServer = new DDServer();
		Server server = ServerBuilder.forPort(portNumber).addService(ddServer).build().start();

		logger.info("DDServer started, listening on " + portNumber);

		server.awaitTermination();
	}

	@Override
	public void initialSystem(Empty request, StreamObserver<ddResp> responseObserver) {
		 System.out.println("receiving initialSystem request for DD ");
		 String status;

		 if(myDD.isOn()) {
			  status ="On";
		 }
		 else {
			  status ="Off";

		 }
		 String sName=myDD.getSystemName();
		 String sStatus = status;
		 Integer sHelpful = myDD.getHelpful();
		 Integer sFrequency=myDD.getFrequency();

			
		 ddResp response = ddResp.newBuilder()
				 .setSname(sName).setStatus(sStatus).setHelpful(sHelpful).setFrequency(sFrequency)
				 .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeHelpful(ValRequest request, StreamObserver<ValResponse> responseObserver) {
		int currentHelpful= myDD.getHelpful();
		int changeHelpful = request.getLength();
		 System.out.println("receiving Helpful for DD");
		 int newHelpful = currentHelpful+changeHelpful;
		 if(newHelpful>10 || newHelpful<0) {
			 System.out.println("Helpful must be between 0-10:" +newHelpful);
			 System.out.println("Returning current Helpful:" +myDD.getHelpful());
			 ValResponse response = ValResponse.newBuilder().setLength(myDD.getHelpful()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }
		 else {
			 System.out.println("New Helpful is set :" +newHelpful);
			 myDD.setHelpful(newHelpful);
			 ValResponse response = ValResponse.newBuilder().setLength(newHelpful).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }
	}

	@Override
	public void changeFrequency(ValRequest request, StreamObserver<ValResponse> responseObserver) {
		int currentFrequency= myDD.getFrequency();
		int changeFrequency = request.getLength();
		 System.out.println("receiving Frequency for DD");
		 int newFrequency = currentFrequency+changeFrequency;
		 if(newFrequency>10 || newFrequency<0) {
			 System.out.println("Frequency must be between 0-10:" +newFrequency);
			 System.out.println("Returning current Frequency:" +myDD.getFrequency());
			 ValResponse response = ValResponse.newBuilder().setLength(myDD.getFrequency()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }
		 else {
			 System.out.println("New Frequency is set :" +newFrequency);
			 myDD.setFrequency(newFrequency);
			 ValResponse response = ValResponse.newBuilder().setLength(newFrequency).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }
	}

	@Override
	public void onOff(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		 System.out.println("receiving onOFF for DD ");
		 Boolean onOff = request.getMsg();
		 myDD.setOn(onOff);
		 
			
		 BooleanRes response = BooleanRes.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeSystemName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		String name = request.getText();
		System.out.println("Changing DD name to " + name);

		myDD.setSystemName(name);

		StringResponse response = StringResponse.newBuilder().setText(name).build();
		System.out.println("Response " + response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
