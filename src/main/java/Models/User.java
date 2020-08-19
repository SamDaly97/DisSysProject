package Models;

public class User {
	private String system, systemName;
	private boolean on;
	private int activity;	
	
	public User(){
		this.system="User";
		this.on=true;
		this.systemName="Custom User Name";
		this.activity=6;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getActivity() {
		return activity;
	}

	public void setActivity(int activity) {
		this.activity = activity;
	}
	
	
	
	
}
