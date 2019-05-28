package business;

public class Employee extends Person {
	
	private String ssn;

	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getSsn() {
		StringBuilder maskedSsn = new StringBuilder(ssn);
		String last4 = maskedSsn.substring(7);
		maskedSsn.replace(0,6,"xxx-xx");
		return maskedSsn.toString();
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" +
					"SSN: " + getSsn();
	}
	
	
	

}
