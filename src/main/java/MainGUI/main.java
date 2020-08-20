package MainGUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import org.DS.project.EBankGRPC.*;
import org.DS.project.EBankGRPC.Phone.phoneResp;

import GRPC.DDServer;
import GRPC.StatementServer;
import GRPC.UserServer;
import io.grpc.stub.StreamObserver;
import jmDNS.Registering;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import java.awt.Color;

public class main {
	private JFrame frame;
	private JTextField system_name_text;
	private JTextField system_onOff_text;

	// stubs and channels for services
	private static UserServiceGrpc.UserServiceBlockingStub user_blockingStub;
	private static UserServiceGrpc.UserServiceStub user_asyncStub;
	private static UserServiceGrpc.UserServiceFutureStub user_futureStub;

	private static DDServiceGrpc.DDServiceBlockingStub dd_blockingStub;
	private static DDServiceGrpc.DDServiceStub dd_asyncStub;
	private static DDServiceGrpc.DDServiceFutureStub dd_futureStub;

	private static StatementServiceGrpc.StatementServiceBlockingStub statement_blockingStub;
	private static StatementServiceGrpc.StatementServiceStub statement_asyncStub;
	private static StatementServiceGrpc.StatementServiceFutureStub statement_futureStub;

	private static PhoneServiceGrpc.PhoneServiceBlockingStub phone_blockingStub;
	private static PhoneServiceGrpc.PhoneServiceStub phone_asyncStub;
	private static PhoneServiceGrpc.PhoneServiceFutureStub phone_futureStub;

	private JTextField userName_tf;
	private JTextField ddName_tf;
	private JTextField statementName_tf;
	private JTextField phoneName_tf;

	public JLabel ddInfo_name;
	public JLabel ddInfo_status;
	public JLabel ddInfo_helpful;
	public JLabel ddInfo_frequency;

	public JLabel userInfo_name;
	public JLabel userInfo_status;
	public JLabel userInfo_activity;

	public JLabel phoneInfo_name;
	public JLabel phoneInfo_status;
	public JLabel phoneInfo_battery;
	public JLabel phoneInfo_app;

	public JLabel statementInfo_name;
	public JLabel statementInfo_status;
	public JLabel statementInfo_helpful;
	public JLabel statementInfo_stop;

	// Ports
	int userPort = 1234;
	int ddPort = 1235;
	int statementPort = 1236;
	int phonePort = 1237;

	// Launching the application.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Creating the application.

	public main() throws InterruptedException, IOException {
		initialize();
		Registering r = new Registering();
		// Starting register, servers, channel and stubs, unregistering and loading
		// initial systems
		r.jmndsRegister(userPort, ddPort, statementPort, phonePort);
		startGRPCServers();
		channels();
		r.unRegister();
		loadInitialDevices();
	}

	// starting the servers 1234,1235,1236,1237
	public void startGRPCServers() throws IOException, InterruptedException {
		UserServer.startDiscovery();
		DDServer.startDiscovery();
		StatementServer.startDiscovery();

	}

	// initialising system
	public void loadInitialDevices() throws IOException, InterruptedException {
		initialUser();
		initialDD();
		initialStatement();
		initialPhone();
	}

	// starting channels
	public void channels() {

		System.out.println("CHANNELS STARTING");
		ManagedChannel userChannel = ManagedChannelBuilder.forAddress("localhost", userPort).usePlaintext().build();
		ManagedChannel ddChannel = ManagedChannelBuilder.forAddress("localhost", ddPort).usePlaintext().build();
		ManagedChannel statementChannel = ManagedChannelBuilder.forAddress("localhost", statementPort).usePlaintext()
				.build();
		ManagedChannel phoneChannel = ManagedChannelBuilder.forAddress("localhost", phonePort).usePlaintext().build();

		user_blockingStub = UserServiceGrpc.newBlockingStub(userChannel);
		user_asyncStub = UserServiceGrpc.newStub(userChannel);
		user_futureStub = UserServiceGrpc.newFutureStub(userChannel);

		dd_blockingStub = DDServiceGrpc.newBlockingStub(ddChannel);
		dd_asyncStub = DDServiceGrpc.newStub(ddChannel);
		dd_futureStub = DDServiceGrpc.newFutureStub(ddChannel);

		statement_blockingStub = StatementServiceGrpc.newBlockingStub(statementChannel);
		statement_asyncStub = StatementServiceGrpc.newStub(statementChannel);
		statement_futureStub = StatementServiceGrpc.newFutureStub(statementChannel);

		phone_blockingStub = PhoneServiceGrpc.newBlockingStub(phoneChannel);

	}

	// initializing the GUI
	// setting backgrounds and labels
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.cyan);
		frame.setBounds(100, 100, 468, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel headLabel = new JLabel("EBank");
		headLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		headLabel.setBounds(101, 11, 245, 14);
		frame.getContentPane().add(headLabel);

		JLabel controller_lbl = new JLabel("Bank Manager");
		controller_lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		controller_lbl.setBounds(10, 64, 143, 14);
		frame.getContentPane().add(controller_lbl);

		JLabel system_name_lbl = new JLabel("System Name");
		system_name_lbl.setBounds(56, 89, 83, 14);
		frame.getContentPane().add(system_name_lbl);

		JLabel helpful_lbl = new JLabel("Helpful");
		helpful_lbl.setBounds(275, 90, 48, 14);
		frame.getContentPane().add(helpful_lbl);

		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setBounds(370, 90, 48, 14);
		frame.getContentPane().add(lblFrequency);

		JLabel device_name2_lblabel = new JLabel("System Name");
		device_name2_lblabel.setBounds(56, 135, 83, 14);
		frame.getContentPane().add(device_name2_lblabel);

		JLabel status2_lbl = new JLabel("Status");
		status2_lbl.setBounds(170, 135, 83, 14);
		frame.getContentPane().add(status2_lbl);

		JLabel helpful2_lbl = new JLabel("Helpful");
		helpful2_lbl.setBounds(270, 135, 48, 14);
		frame.getContentPane().add(helpful2_lbl);

		JLabel lblStop = new JLabel("Stop");
		lblStop.setBounds(370, 135, 38, 14);
		frame.getContentPane().add(lblStop);

		JLabel device_name3_lbl = new JLabel("System Name");
		device_name3_lbl.setBounds(56, 180, 83, 14);
		frame.getContentPane().add(device_name3_lbl);

		JLabel status_3_lbl = new JLabel("Battery");
		status_3_lbl.setBounds(270, 180, 48, 14);
		frame.getContentPane().add(status_3_lbl);

		JLabel lblApplication = new JLabel("Application");
		lblApplication.setBounds(355, 180, 63, 14);
		frame.getContentPane().add(lblApplication);

		JLabel battery_lbl = new JLabel("Status");
		battery_lbl.setBounds(170, 180, 83, 14);
		frame.getContentPane().add(battery_lbl);

		JLabel device_name4_lbl = new JLabel("System Name");
		device_name4_lbl.setBounds(56, 225, 83, 14);
		frame.getContentPane().add(device_name4_lbl);

		JLabel device_status4_lbl = new JLabel("Status");
		device_status4_lbl.setBounds(170, 225, 83, 14);
		frame.getContentPane().add(device_status4_lbl);

		JLabel lblActivity = new JLabel("Activity");
		lblActivity.setBounds(254, 225, 72, 14);
		frame.getContentPane().add(lblActivity);

		JButton dd_helpfulUp_btn = new JButton("↑");
		dd_helpfulUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		dd_helpfulUp_btn.setBounds(290, 104, 38, 20);
		frame.getContentPane().add(dd_helpfulUp_btn);
		
		dd_helpfulUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(+1);
				changeHelpful(1, "DD");
			}
		});

		JButton dd_helpfulDown_btn = new JButton("-");
		dd_helpfulDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		dd_helpfulDown_btn.setBounds(254, 104, 38, 20);
		frame.getContentPane().add(dd_helpfulDown_btn);
		
		dd_helpfulDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(-1);
				changeHelpful(-1, "DD");
			}
		});

		JButton statement_helpfulDown_btn = new JButton("-");
		statement_helpfulDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		statement_helpfulDown_btn.setBounds(254, 149, 38, 20);
		frame.getContentPane().add(statement_helpfulDown_btn);
		
		statement_helpfulDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(-1);
				changeHelpful(-1, "Statement");
			}
		});

		JButton sstatement_helpfulUp_btn = new JButton("↑");

		sstatement_helpfulUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		sstatement_helpfulUp_btn.setBounds(290, 149, 38, 20);
		frame.getContentPane().add(sstatement_helpfulUp_btn);
		
		sstatement_helpfulUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
				changeHelpful(1, "Statement");
			}
		});

		ddName_tf = new JTextField();
		ddName_tf.setBounds(56, 105, 86, 20);
		frame.getContentPane().add(ddName_tf);
		ddName_tf.setColumns(10);
		
		ddName_tf.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				System.out.println("changedUpdate " + ddName_tf.getText());
			}

			public void removeUpdate(DocumentEvent e) {
				changeSystemName(ddName_tf.getText(), "DD");
			}

			public void insertUpdate(DocumentEvent e) {
				System.out.println("insertUpdate " + ddName_tf.getText());
				changeSystemName(ddName_tf.getText(), "DD");

			}

		});

		statementName_tf = new JTextField();
		statementName_tf.setColumns(10);
		statementName_tf.setBounds(56, 150, 86, 20);
		frame.getContentPane().add(statementName_tf);
		statementName_tf.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			}

			public void removeUpdate(DocumentEvent e) {
				changeSystemName(statementName_tf.getText(), "Statement");
			}

			public void insertUpdate(DocumentEvent e) {

				changeSystemName(statementName_tf.getText(), "Statement");
			}

		});

		phoneName_tf = new JTextField();
		phoneName_tf.setColumns(10);
		phoneName_tf.setBounds(56, 194, 86, 20);
		frame.getContentPane().add(phoneName_tf);
		
		phoneName_tf.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			}
			public void removeUpdate(DocumentEvent e) {
				changeSystemName(phoneName_tf.getText(), "Phone");
			}

			public void insertUpdate(DocumentEvent e) {
				System.out.println("insertUpdate " + phoneName_tf.getText());
				changeSystemName(phoneName_tf.getText(), "Phone");
			}

		});

		userName_tf = new JTextField();
		userName_tf.setColumns(10);
		userName_tf.setBounds(56, 238, 86, 20);
		frame.getContentPane().add(userName_tf);
		
		userName_tf.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
			}
			public void removeUpdate(DocumentEvent e) {
				changeSystemName(userName_tf.getText(), "User");
			}
			public void insertUpdate(DocumentEvent e) {
				changeSystemName(userName_tf.getText(), "User");
			}

		});

		JButton user_activityDown_btn = new JButton("-");
		user_activityDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		user_activityDown_btn.setBounds(254, 240, 38, 20);
		frame.getContentPane().add(user_activityDown_btn);
		
		user_activityDown_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(-1);
				changeActivity(-1);
			}
		});

		JButton user_activityUp_btn = new JButton("↑");
		user_activityUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		user_activityUp_btn.setBounds(290, 240, 38, 20);
		frame.getContentPane().add(user_activityUp_btn);
		
		user_activityUp_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(1);
				changeActivity(1);
			}
		});

		JLabel lblDD = new JLabel("DD");
		lblDD.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblDD.setBounds(4, 105, 36, 14);
		frame.getContentPane().add(lblDD);

		JLabel lblStatement = new JLabel("Statement");
		lblStatement.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStatement.setBounds(4, 155, 45, 14);
		frame.getContentPane().add(lblStatement);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPhone.setBounds(4, 200, 56, 14);
		frame.getContentPane().add(lblPhone);

		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblUser.setBounds(4, 241, 45, 14);
		frame.getContentPane().add(lblUser);

		JLabel label = new JLabel("DD");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(10, 313, 36, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("Statement");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(10, 357, 45, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Phone");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_2.setBounds(10, 402, 76, 14);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("User");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_3.setBounds(10, 439, 45, 14);
		frame.getContentPane().add(label_3);

		JLabel lblSystemStatus = new JLabel("System Stats");
		lblSystemStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSystemStatus.setBounds(10, 288, 143, 14);
		frame.getContentPane().add(lblSystemStatus);

		final JToggleButton ddOnOff_tgl = new JToggleButton("On");
		ddOnOff_tgl.setSelected(true);
		ddOnOff_tgl.setBounds(160, 104, 86, 20);
		frame.getContentPane().add(ddOnOff_tgl);
		ddOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				if (ddOnOff_tgl.isSelected()) {
					ddOnOff_tgl.setText("On");
					onOff(true, "DD");
				} 
				else {
					ddOnOff_tgl.setText("Off");
					onOff(false, "DD");
				}
			}
		});

		final JToggleButton statementOnOff_tgl = new JToggleButton("On");
		statementOnOff_tgl.setSelected(true);
		statementOnOff_tgl.setBounds(160, 149, 86, 20);
		frame.getContentPane().add(statementOnOff_tgl);
		
		statementOnOff_tgl.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent event) {
				if (statementOnOff_tgl.isSelected()) {
					statementOnOff_tgl.setText("On");
					onOff(true, "Statement");

				} 
				else {
					statementOnOff_tgl.setText("Off");
					onOff(false, "Statement");
				}

			}
		});

		final JToggleButton phoneOnOff_tgl = new JToggleButton("On");
		phoneOnOff_tgl.setSelected(true);
		phoneOnOff_tgl.setBounds(160, 194, 86, 20);
		frame.getContentPane().add(phoneOnOff_tgl);
		
		phoneOnOff_tgl.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent event) {
				if (phoneOnOff_tgl.isSelected()) {
					phoneOnOff_tgl.setText("On");
					onOff(true, "Phone");

				} 
				else {
					phoneOnOff_tgl.setText("Off");
					onOff(false, "Phone");

				}

			}
		});

		final JToggleButton userOnOff_tgl = new JToggleButton("On");
		userOnOff_tgl.setSelected(true);
		userOnOff_tgl.setBounds(160, 240, 86, 20);
		frame.getContentPane().add(userOnOff_tgl);
		
		userOnOff_tgl.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent event) {
				if (userOnOff_tgl.isSelected()) {
					userOnOff_tgl.setText("On");
					onOff(true, "User");
				}
				else {
					userOnOff_tgl.setText("Off");
					onOff(false, "User");
				}

			}
		});

		final JToggleButton statementStop_tgl = new JToggleButton("Stop");
		statementStop_tgl.setBounds(345, 149, 86, 20);
		frame.getContentPane().add(statementStop_tgl);
	
		statementStop_tgl.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent event) {
				if (statementStop_tgl.isSelected()) {
					statementStop_tgl.setText("Stopped");
					stop(true);
					statementInfo_stop.setText("Stopped");

				} 
				else {
					statementStop_tgl.setText("Stop");
					stop(false);
					statementInfo_stop.setText("Stop");

				}

			}
		});

		JButton ddFrequencyDown_btn = new JButton("↓");
		ddFrequencyDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		ddFrequencyDown_btn.setBounds(355, 104, 38, 20);
		frame.getContentPane().add(ddFrequencyDown_btn);
		
		ddFrequencyDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(1);
				changeFrequency(-1);
			}
		});

		JButton ddFrequencyUp_btn = new JButton("↑");
		ddFrequencyUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		ddFrequencyUp_btn.setBounds(391, 104, 38, 20);
		frame.getContentPane().add(ddFrequencyUp_btn);
		
		ddFrequencyUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
				changeFrequency(1);
			}
		});

		String[] appNames = { "Select an Application", "AIB", "BOI", "TSB", "KBC", "Ulster" };
		JComboBox appList = new JComboBox(appNames);
		appList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		appList.setBounds(345, 194, 86, 20);
		frame.getContentPane().add(appList);
		
		appList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				String appName = (String) cb.getSelectedItem();
				changeApplication(appName);
			}
		});

		JLabel lblDeviceStatus_1 = new JLabel("Status");
		lblDeviceStatus_1.setBounds(170, 90, 83, 14);
		frame.getContentPane().add(lblDeviceStatus_1);

		statementInfo_name = new JLabel("System Name");
		statementInfo_name.setBounds(10, 377, 111, 14);
		frame.getContentPane().add(statementInfo_name);

		statementInfo_status = new JLabel("Status");
		statementInfo_status.setBounds(125, 377, 90, 14);
		frame.getContentPane().add(statementInfo_status);

		statementInfo_helpful = new JLabel("Helpful");
		statementInfo_helpful.setBounds(220, 377, 90, 14);
		frame.getContentPane().add(statementInfo_helpful);

		statementInfo_stop = new JLabel("Stop");
		statementInfo_stop.setBounds(320, 377, 38, 14);
		frame.getContentPane().add(statementInfo_stop);

		ddInfo_name = new JLabel("System Name");
		ddInfo_name.setBounds(10, 332, 111, 14);
		frame.getContentPane().add(ddInfo_name);

		ddInfo_status = new JLabel("Status");
		ddInfo_status.setBounds(125, 332, 90, 14);
		frame.getContentPane().add(ddInfo_status);

		ddInfo_helpful = new JLabel("Helpful");
		ddInfo_helpful.setBounds(220, 332, 90, 14);
		frame.getContentPane().add(ddInfo_helpful);

		ddInfo_frequency = new JLabel("Frequency");
		ddInfo_frequency.setBounds(320, 332, 98, 14);
		frame.getContentPane().add(ddInfo_frequency);

		phoneInfo_name = new JLabel("System Name");
		phoneInfo_name.setBounds(10, 418, 111, 14);
		frame.getContentPane().add(phoneInfo_name);

		phoneInfo_status = new JLabel("Status");
		phoneInfo_status.setBounds(125, 418, 83, 14);
		frame.getContentPane().add(phoneInfo_status);

		phoneInfo_battery = new JLabel("Battery");
		phoneInfo_battery.setBounds(220, 418, 83, 14);
		frame.getContentPane().add(phoneInfo_battery);

		phoneInfo_app = new JLabel("Application");
		phoneInfo_app.setBounds(320, 418, 98, 14);
		frame.getContentPane().add(phoneInfo_app);

		userInfo_name = new JLabel("System Name");
		userInfo_name.setBounds(10, 458, 111, 14);
		frame.getContentPane().add(userInfo_name);

		userInfo_status = new JLabel("Device Status");
		userInfo_status.setBounds(125, 458, 90, 14);
		frame.getContentPane().add(userInfo_status);

		userInfo_activity = new JLabel("Activity");
		userInfo_activity.setBounds(220, 458, 103, 14);
		frame.getContentPane().add(userInfo_activity);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 357, 432, 2);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 402, 432, 2);
		frame.getContentPane().add(separator_1);

	}

	// changing system name
	public void changeSystemName(String newName, String system) {

		System.out.println("New Name " + newName);
		System.out.println("system " + system);

		StringRequest req = StringRequest.newBuilder().setText(newName).build();
		System.out.println("Changing system Name");

		// Handle system
		if (system.equals("DD")) {
			System.out.println("system is a DD");
			StringRequest request = StringRequest.newBuilder().setText(newName).build();
			StreamObserver<StringResponse> responseObserver = new StreamObserver<StringResponse>() {

				@Override
				public void onNext(StringResponse value) {
					// TODO Auto-generated method stub
					System.out.println(" on next DD Response " + value.getText());
					ddInfo_name.setText("Name: " + value.getText());
				}

				@Override
				public void onError(Throwable t) {

					System.out.println("Error with name connection for DD ");
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("On completed for DD name");
				}

			};
			
			dd_asyncStub.changeSystemName(request, responseObserver);
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				System.out.println("Connection Interrupted");

			}
		} 
		else if (system.equals("Statement")) {
			System.out.println("system is a Statement");
			StringResponse response = statement_blockingStub.changeSystemName(req);
			System.out.println("Statement Response " + response.getText());
			statementInfo_name.setText("Name: " + response.getText());

		} 
		else if (system.equals("User")) {
			System.out.println("system is a User");
			StringResponse response = user_blockingStub.changeSystemName(req);
			System.out.println("User Response " + response.getText());
			userInfo_name.setText("Name: " + response.getText());

		} 
		else if (system.equals("Phone")) {
			StringResponse response = phone_blockingStub.changePhoneName(req);
			System.out.println("Phone Response " + response.getText());
			phoneInfo_name.setText("Name: " + response.getText());
		}

	}

	// changing helpful
	public void changeHelpful(int helpful, String system) {
		ValRequest req = ValRequest.newBuilder().setLength(helpful).build();
		System.out.println("Changing Helpful");

		if (system.equals("DD")) {
			StreamObserver<ValResponse> response = new StreamObserver<ValResponse>() {
				@Override
				public void onNext(ValResponse value) {
					System.out.println("Receiving " + value);
					String help = String.valueOf(value.getLength());
					ddInfo_helpful.setText("Helpful" + help);
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing helpful");
				}

			};


			dd_asyncStub.changeHelpful(req, response);
			System.out.println("DD response " + req.getLength());

		} 
		else if (system.equals("Statement")) {
			StreamObserver<ValResponse> response = new StreamObserver<ValResponse>() {
				@Override
				public void onNext(ValResponse value) {
					System.out.println("Receiving " + value);
					String help = String.valueOf(value.getLength());
					statementInfo_helpful.setText("Helpful: " + help);
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing helpful");
				}

			};
			statement_asyncStub.changeHelpful(req, response);
			System.out.println("Statement Response" + req.getLength());
		}

	}

	// changing user activity
	public void changeActivity(int value) {
		ValRequest request = ValRequest.newBuilder().setLength(value).build();
		System.out.println("Changing activity");
		
		StreamObserver<ValResponse> response = new StreamObserver<ValResponse>() {
			@Override
			public void onNext(ValResponse value) {
				System.out.println("Receiving " + value);
				String activity = String.valueOf(value.getLength());
				userInfo_activity.setText("Activity: " + activity);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Completed changing activity");
			}

		};
		user_asyncStub.changeActivity(request, response);

	}

	// changing frequency
	public void changeFrequency(int value) {
		ValRequest req = ValRequest.newBuilder().setLength(value).build();
		System.out.println("Changing Frequency");

		ValResponse response;
		// Error Handling
		try {
			response = dd_blockingStub.changeFrequency(req);

		} 
		catch (StatusRuntimeException e) {
			System.out.println("failed: " + e.getStatus());
			return;
		}

		System.out.println("DD Frequency response" + response.getLength());
		String frequency = String.valueOf(response.getLength());
		ddInfo_frequency.setText("frequency No: " + frequency);

	}

	// changing phone app
	public void changeApplication(String appName) {
		StringRequest req = StringRequest.newBuilder().setText(appName).build();
		System.out.println("Changing application to " + req.getText());
		StringResponse response;

		// Error Handling
		try {
			response = phone_blockingStub.changeApplication(req);

		} 
		catch (StatusRuntimeException e) {
			System.out.println("failed: " + e.getStatus());
			return;
		}

		System.out.println("Phone app response" + response.getText());
		String app = String.valueOf(response.getText());
		phoneInfo_app.setText("App: " + app);

	}

	// stopping statements
	public void stop(boolean value) {
		BooleanReq req = BooleanReq.newBuilder().setMsg(value).build();
		System.out.println("Stop");
		BooleanRes response;
		// Error Handling
		try {
			response = statement_blockingStub.stop(req);

		} 
		catch (StatusRuntimeException e) {
			System.out.println("failed: " + e.getStatus());
			return;
		}
	}

	// on and off
	public void onOff(boolean onOff, String system) {
		BooleanReq req = BooleanReq.newBuilder().setMsg(onOff).build();
		System.out.println("On Off");


		if (system.equals("DD")) {
			BooleanRes response;
			// Error Handling
			try {
				response = dd_blockingStub.onOff(req);

			} 
			catch (StatusRuntimeException e) {
				System.out.println("failed: " + e.getStatus());
				return;
			}

			System.out.println("DD response" + response.getMsg());
			Boolean status = response.getMsg();
			if (status) {
				ddInfo_status.setText("Status: On");
			} 
			else {
				ddInfo_status.setText("Status: Off");
			}
		} 
		else if (system.equals("Statement")) {
			BooleanRes response;
			// Error Handling
			try {
				response = statement_blockingStub.onOff(req);

			} 
			catch (StatusRuntimeException e) {
				System.out.println("failed: " + e.getStatus());
				return;
			}
			System.out.println("Statement Response" + response.getMsg());
			Boolean status = response.getMsg();
			if (status) {
				statementInfo_status.setText("Status: On");
			} 
			else {
				statementInfo_status.setText("Status: Off");
			}
		} 
		else if (system.equals("Phone")) {
			System.out.println("Phone Response ");

			BooleanRes response;
			// Error Handling
			try {
				response = phone_blockingStub.onOff(req);

			} 
			catch (StatusRuntimeException e) {
				System.out.println("RPC failed: " + e.getStatus());
				return;
			}

			System.out.println("phone Response" + response.getMsg());
			Boolean status = response.getMsg();
			if (status) {
				phoneInfo_status.setText("Status: On");
			} 
			else {
				phoneInfo_status.setText("Status: Off");
			}
		} 
		else if (system.equals("User")) {
			BooleanRes response;

			// Error Handling
			try {
				response = user_blockingStub.onOff(req);

			} 
			catch (StatusRuntimeException e) {
				System.out.println("failed: " + e.getStatus());
				return;
			}

			System.out.println("User Response" + response.getMsg());
			Boolean status = response.getMsg();
			if (status) {
				userInfo_status.setText("Status: On");
			} 
			else {
				userInfo_status.setText("Status: Off");
			}
		}
	}

	// initialize statement
	public void initialStatement() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Statement");
		statementResp response;
		// Error Handling
		try {
			response = statement_blockingStub.initialSystem(req);

		} 
		catch (StatusRuntimeException e) {
			System.out.println("failed: " + e.getStatus());
			return;
		}
		statementInfo_name.setText("Name: " + response.getSname());
		statementInfo_status.setText("Status: " + response.getStatus());
		String helpful = String.valueOf(response.getHelpful());
		statementInfo_helpful.setText("Helpful: " + helpful);

	}

	// initialize direct debit
	public void initialDD() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial DD");
		ddResp response;

		// Error Handling
		try {
			response = dd_blockingStub.initialSystem(req);

		} 
		catch (StatusRuntimeException e) {
			System.out.println("failed: " + e.getStatus());
			return;
		}
		ddInfo_name.setText("Name: " + response.getSname());
		ddInfo_status.setText("Status: " + response.getStatus());
		String helpful = String.valueOf(response.getHelpful());
		ddInfo_helpful.setText("Helpful: " + helpful);
		String frequency = String.valueOf(response.getFrequency());
		ddInfo_frequency.setText("Frequency: " + frequency);

	}

	// initialize user
	public void initialUser() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial User");
		userResp response;
		// Error Handling
		try {
			response = user_blockingStub.initialSystem(req);

		} 
		catch (StatusRuntimeException e) {
			System.out.println("failed: " + e.getStatus());
			return;
		}

		userInfo_name.setText("Name: " + response.getSname());
		userInfo_status.setText("Status: " + response.getStatus());
		String activity = String.valueOf(response.getActivity());
		userInfo_activity.setText("Activity: " + activity);

	}

	// initialize phone
	public void initialPhone() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Phone");
		org.DS.project.EBankGRPC.phoneResp response;

		// Error Handling
		try {
			response = phone_blockingStub.initialPhone(req);

		} 
		catch (StatusRuntimeException e) {
			System.out.println("failed: " + e.getStatus());
			return;
		}

		phoneInfo_name.setText("Name: " + response.getPname());
		phoneInfo_status.setText("Status: " + response.getStatus());
		String battery = String.valueOf(response.getBattery());
		phoneInfo_app.setText("App: " + response.getApp());
		phoneInfo_battery.setText("Battery:" + battery);
	}

}
