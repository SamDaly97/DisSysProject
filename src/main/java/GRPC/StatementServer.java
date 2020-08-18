package GRPC;

import java.io.IOException;
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
import org.DS.project.EBankGRPC.statementResp;

import Models.Statement;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class StatementServer extends StatementServiceImplBase{
	private static final Logger logger = Logger.getLogger(StatementServer.class.getName());
	public Statement myStatement = new Statement();
	public static int statementPort;
	
	private static class SampleListener implements ServiceListener {
		 
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());

        }

        
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        
        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            System.out.println("Get Name: " + event.getName()+" PORT: "+event.getInfo().getPort());
            
            //Start GRPC server with discovered device
            if(event.getName().equals("Lamp")) {
            	System.out.println("Found Lamp port: " + event.getInfo().getPort());
       		 try {
       			 statementPort = event.getInfo().getPort();
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

        
        public static void startGRPC(int portNumber) throws IOException, InterruptedException {
   		 
   		 StatementServer statementServer = new StatementServer();
   		 
   		    
   		    Server server = ServerBuilder.forPort(portNumber)
   		        .addService(statementServer)
   		        .build()
   		        .start();
   		    
   		    logger.info("LampServer started, listening on " + portNumber);
   		    		    
   			 
   		    server.awaitTermination();
   	 }
    }

	@Override
	public void initialStatement(Empty request, StreamObserver<statementResp> responseObserver) {
		System.out.println("receiving initialStatement for Statement ");
		String status;

		if(myStatement.isOn()) {
			 status ="On";
		}else {
			 status ="Off";

		}
		 
		String opt;

		if(myStatement.isOptOut()) {
			opt ="In";
		}else {
			opt ="Out";

		}
		 
		String sName=myStatement.getName();
		String sStatus = status;
		String sOpt = opt;
			
		statementResp response = statementResp.newBuilder()
				 .setSname(sName).setStatus(sStatus).setOpt(sOpt)
				 .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void optOut(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		 System.out.println("receiving optOut for Statement ");
		 Boolean optOut = request.getMsg();
		 myStatement.setOn(optOut);
		 
			
		 BooleanRes response = BooleanRes.newBuilder().setMsg(optOut).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
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
	public void changeStatementType(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		System.out.println("Type whether your statement is a Debit or Credit account.");
		String statementType = request.getText();
		System.out.println("Changing account type to "+statementType);

		myStatement.setType(statementType);
		 
		StringResponse response = StringResponse.newBuilder().setText(statementType).build();
		System.out.println("Response "+response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeStatementName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		 String name = request.getText();
		 System.out.println("Changing Statement name to "+name);

		 myStatement.setName(name);
		 
		 StringResponse response = StringResponse.newBuilder().setText(name).build();
		 System.out.println("Response "+response.getText());
		 responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	

}
