package problema3;

public class Customer {
	private String lastName;
	private String firstName;
	private Adress adress;
	private PaymentMethod payMethod;
	public Customer(String lastName, String firstName, Adress adress, PaymentMethod payMethode, int age, PaymentMethod payMethod) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.adress = adress;
		this.payMethod = payMethod;
		
	}

	public String getlastName() {
		return lastName;
	}

	public String getfirstName() {
		return firstName;
	}

	Adress getAdress() {
		return adress;
	}

	PaymentMethod getPayMethod() {
		return payMethod;
	}

	public String getCompleteName() {
		return   getfirstName() + " " + getlastName();
	}


}
