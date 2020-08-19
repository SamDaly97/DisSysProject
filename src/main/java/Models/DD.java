package Models;

public class DD {
	private String name;
	private boolean on;
	private int amount;
	
	public DD() {
		
		this.name = "Sam";
		this.on = false;
		this.amount = 50;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
