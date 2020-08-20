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
import org.DS.project.EBankGRPC.StatementServiceGrpc.StatementServiceImplBase;
import org.DS.project.EBankGRPC.StringRequest;
import org.DS.project.EBankGRPC.StringResponse;
import org.DS.project.EBankGRPC.ValRequest;
import org.DS.project.EBankGRPC.ValResponse;
import org.DS.project.EBankGRPC.statementResp;

import Models.Statement;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
/*
 * Statement server class
 * this sets up discovering and registering for JMDNS
 * starts server once index is run
 * connects via GUI
 * auto generated override/implement methods added for functionality 
 */
public class StatementServer extends StatementServiceImplBase {

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


			if (event.getName().equals("Statement")) {
				System.out.println("Found Statement port: " + event.getInfo().getPort());
				try {
					System.out.println("STARTING Statement GRPC SERVER");
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

	private static final Logger logger = Logger.getLogger(StatementServer.class.getName());
	public Statement myStatement = new Statement();

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
		StatementServer statementServer = new StatementServer();
		Server server = ServerBuilder.forPort(portNumber).addService(statementServer).build().start();

		logger.info("StatementServer started, listening on " + portNumber);

		server.awaitTermination();
	}

	@Override
	public void initialSystem(Empty request, StreamObserver<statementResp> responseObserver) {
		System.out.println("receiving initialSystem request for statement ");
		String status;

		if (myStatement.isOn()) {
			status = "On";
		} 
		else {
			status = "Off";

		}
		String sName = myStatement.getSystemName();
		String sStatus = status;
		Boolean sStop = myStatement.isStop();
		Integer sHelpful = myStatement.getHelpful();

		statementResp response = statementResp.newBuilder().setSname(sName).setStatus(sStatus).setStop(sStop)
				.setHelpful(sHelpful).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeHelpful(ValRequest request, StreamObserver<ValResponse> responseObserver) {
		int currentHelpful = myStatement.getHelpful();
		int changeHelpful = request.getLength();
		System.out.println("receiving Helpful for Statement");
		int newHelpful = currentHelpful + changeHelpful;
		if (newHelpful > 10 || newHelpful < 0) {
			System.out.println("Helpful must be between 0-10:" + newHelpful);
			System.out.println("Returning current Helpful:" + myStatement.getHelpful());
			ValResponse response = ValResponse.newBuilder().setLength(myStatement.getHelpful()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} 
		else {
			System.out.println("New Helpful is set :" + newHelpful);
			myStatement.setHelpful(newHelpful);
			ValResponse response = ValResponse.newBuilder().setLength(newHelpful).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}

	@Override
	public void onOff(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		System.out.println("receiving onOFF for Statement ");
		Boolean onOff = request.getMsg();
		myStatement.setOn(onOff);

		BooleanRes response = BooleanRes.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void stop(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		System.out.println("receiving stop for Statement ");
		Boolean stop = request.getMsg();
		myStatement.setStop(stop);

		BooleanRes response = BooleanRes.newBuilder().setMsg(stop).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeSystemName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		String name = request.getText();
		System.out.println("Changing statement name to " + name);

		myStatement.setSystemName(name);

		StringResponse response = StringResponse.newBuilder().setText(name).build();
		System.out.println("Response " + response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
