package Models;

public class Statement {
	private String name, type;
	private boolean on, optOut;
	
	public Statement() {
		this.name = "Statement";
		this.on = true;
		this.type = "Debit";
		this.optOut = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public boolean isOptOut() {
		return optOut;
	}

	public void setOptOut(boolean optOut) {
		this.optOut = optOut;
	}
	
	
}
