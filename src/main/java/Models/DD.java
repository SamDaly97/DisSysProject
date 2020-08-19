package Models;

public class DD {
	private String system, systemName;
	private boolean On;
	private int helpful, frequency;
	
	public DD() {
		this.system = "Direct Debit";
		this.On = true;
		this.systemName = "Custom DD";
		this.helpful = 8;
		this.frequency = 2;
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

	public int getHelpful() {
		return helpful;
	}

	public void setHelpful(int helpful) {
		this.helpful = helpful;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	
}
