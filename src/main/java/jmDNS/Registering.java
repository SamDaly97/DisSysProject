package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import Models.*;

public class Registering {
	public static JmDNS jmdns;

	public static void main(String[] args) throws UnknownHostException, IOException {

	}

	public void jmndsRegister(int userPort, int ddPort, int statementPort) throws InterruptedException {

		User myUser = new User();
		DD myDD = new DD();
		Statement myStatement = new Statement();

		try {

			// Create a JmDNS instance
			// JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns = JmDNS.create(InetAddress.getLocalHost());
			// Registering all services
			System.out.println("Registering...");
			ServiceInfo serviceUser = ServiceInfo.create("_http._tcp.local.", myUser.getUserName(), userPort,
					"path=index.html");
			ServiceInfo serviceDD = ServiceInfo.create("_http._tcp.local.", myDD.getName(), ddPort, "path=index.html");
			ServiceInfo serviceStatement = ServiceInfo.create("_http._tcp.local.", myStatement.getName(), statementPort,
					"path=index.html");

			jmdns.registerService(serviceUser);
			jmdns.registerService(serviceDD);
			jmdns.registerService(serviceStatement);

			// Wait a bit
			// Thread.sleep(25000);

			// Unregister all services
			// jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void unRegister() {
		System.out.println("Un-registering...");

		jmdns.unregisterAllServices();

	}

}
