
public class Customer {

	private int customerId = -1;
	private String fname = "";
	private String lname = "";
	private String room = "";
	
	public Customer(int customerId, String fname, String lname, String room) {
		
		this.customerId = customerId;
		this.fname = fname;
		this.lname = lname;
		this.setRoom(room);
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	

}
