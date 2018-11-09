public class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	// constructor

	public Employee(String firstName, String lastName, String socialSecurityNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// return first name

	public String getFirstName() {
		
		return firstName;
	}

	// return last name

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public String toString() {
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}

	public double earnings() {
		return 0.0;
		// no implementation here
	}
}