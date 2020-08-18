package GRPC;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import org.DS.project.EBankGRPC.BooleanReq;
import org.DS.project.EBankGRPC.BooleanRes;
import org.DS.project.EBankGRPC.Empty;
import org.DS.project.EBankGRPC.StringRequest;
import org.DS.project.EBankGRPC.StringResponse;
import org.DS.project.EBankGRPC.UserServiceGrpc.UserServiceImplBase;
import org.DS.project.EBankGRPC.speakerResp;
import org.DS.project.EBankGRPC.valRequest;
import org.DS.project.EBankGRPC.valResponse;

import io.grpc.stub.StreamObserver;


public class UserService extends UserServiceImplBase{
	private static final Logger logger = Logger.getLogger(UserService.class.getName());
	public Lamp myLamp = new Lamp();
	public static int lampPort;
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
	       			 lampPort = event.getInfo().getPort();
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
	
	
	

	 public static void main(String[] args) throws IOException, InterruptedException  {
		 
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
	 public int getLampPort() {
			return lampPort;
		}

		public void setLampPort(int lampPort) {
			LampServer.lampPort = lampPort;
		}

	 
	 public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		 
		 LampServer lampServer = new LampServer();
		 
		    
		    Server server = ServerBuilder.forPort(portNumber)
		        .addService(lampServer)
		        .build()
		        .start();
		    
		    logger.info("LampServer started, listening on " + portNumber);
		    		    
			 
		    server.awaitTermination();
	 }

	@Override
	public void initialUser(Empty request, StreamObserver<speakerResp> responseObserver) {
		// TODO Auto-generated method stub
		super.initialUser(request, responseObserver);
	}

	@Override
	public void changeBalance(valRequest request, StreamObserver<valResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.changeBalance(request, responseObserver);
	}

	@Override
	public void activeAccount(BooleanReq request, StreamObserver<valResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.activeAccount(request, responseObserver);
	}

	@Override
	public void changeAccountType(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		// TODO Auto-generated method stub
		super.changeAccountType(request, responseObserver);
	}

	@Override
	public void changeUserName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.changeUserName(request, responseObserver);
	}

	

	
}
