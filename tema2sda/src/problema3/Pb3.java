package problema3;

public class Pb3 {
		public static void main(String[] args) {
			
			Adress ad1 = new Adress("Bd. Unirii", "Bucuresti", 11);
			PaymentMethod pay1 = new PaymentMethod("Card");
			Customer c1 = new Customer("Balint", "Tiberiu", ad1, pay1, 25, pay1);

			System.out.println( "Nume si prenume: " + c1.getCompleteName());
			System.out.println("Adresa: " + c1.getAdress().getFullAdress());
			System.out.println("Metoda de plata: " + c1.getPayMethod().getType());
		}
	
}


