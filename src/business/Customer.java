package business;

public class Customer extends Person {
	
	private String number;

	public Customer(String firstName, String lastName, String number) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
	}

	public Customer() {
		super();
	}

	public String getCustomerNumber() {
		return number;
	}

	public void setCustomerNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Customer Number: " +number;
	}
	


}
