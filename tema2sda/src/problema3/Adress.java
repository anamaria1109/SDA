package problema3;

public class Adress {
	private String str, city;
	private int nr;
	
	public Adress(String street, String city, int number) {
		super();
		this.str = street;
		this.city = city;
		this.nr = number;
	}

	public String getStreet() {
		return this.str;
	}

	public String getCity() {
		return this.city;
	}

	public int getNumber() {
		return this.nr;
	}

	public String getFullAdress() {
		return " Orasul: " + this.city + "; strada: " + this.str + "; numarul: " + this.nr;

	}



}
