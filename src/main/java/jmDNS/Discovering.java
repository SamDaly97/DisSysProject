package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

public class Discovering {
	private static int UserPort;	


	public int getUserPort() {
		return UserPort;
	}

	public void setUserPort(int userPort) {
		UserPort = userPort;
	}


    public static class SampleListener implements ServiceListener {
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service addedPORT?: " + event.getInfo().getPort());

        }

        
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        
        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            System.out.println("Get Name: " + event.getName()+" PORT: "+event.getInfo().getPort());
            if(event.getName().equals("User")) {
            	System.out.println("Found User port: " + event.getInfo().getPort());
            	UserPort =event.getInfo().getPort();
            }
          

        }
    }

    public static void main(String[] args) throws InterruptedException {
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
  
}
