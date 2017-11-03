
public class Customer {

	private int customerId = -1;
	private String fname = "";
	private String lname = "";
	
	public Customer(int customerId, String fname, String lname) {
		
		this.customerId = customerId;
		this.fname = fname;
		this.lname = lname;
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
	

}
