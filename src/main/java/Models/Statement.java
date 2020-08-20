package Models;
/*
 * model for statement class
 * deals with statement name
 * on or off
 * custom statement name
 * helpfulness
 * stopping statement
 * 
 * 
 */
public class Statement {
	private String system, systemName;
	private boolean On, stop;
	private int helpful;

	public Statement() {
		this.system = "Statement";
		this.On = true;
		this.systemName = "Custom Statement";
		this.helpful = 7;
		this.stop = false;
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
		return On;
	}

	public void setOn(boolean on) {
		On = on;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public int getHelpful() {
		return helpful;
	}

	public void setHelpful(int helpful) {
		this.helpful = helpful;
	}
	
	
	
}
