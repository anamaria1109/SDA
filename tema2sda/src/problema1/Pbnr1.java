package problema1;
import java.util.Scanner;

class Pbnr1 {

	private static Scanner x;

	public Pbnr1() {}
		public static void main(String[] args) {
			x = new Scanner(System.in);

			System.out.println("Tipul de drum:");
			String var = x.next();
			System.out.println("Viteza maxima admisa in prima siuatie este - " + primaVar(var));
			System.out.println("Viteza maxima admisa in a 2-a situatie este - " + aDouaVar(var));
			System.out.println("Viteza maxima admisa in a 3-a situatie este - " + aTreiaVar(var));
		}

		public static int primaVar(String opt) {
			if (opt.equalsIgnoreCase("oras")) {
				return 50;
			} else {
				if (opt.equalsIgnoreCase("zona_rezidentiala")) {
					return 30;
				} else {
					if (opt.equalsIgnoreCase("drum_express")) {
						return 100;
					} else {
						if (opt.equalsIgnoreCase("autostrada")) {
							return 130;
						} else {
							return 0;
						}
					}
				}
			}
		}
		public static int aDouaVar(String opt) {

			switch (opt) {
			case "oras":
				return 50;
			case "zona_rezidentiala":
				return 30;
			case "drum_express":
				return 100;
			case "autostrada":
				return 130;
			}
			return 0;
		}

		public static int aTreiaVar(String opt) {
			if (opt.equalsIgnoreCase("oras")) {
				return 50;
			}
			if (opt.equalsIgnoreCase("zona_rezidentiala")) {
				return 30;
			}
			if (opt.equalsIgnoreCase("drum_express")) {
				return 100;
			}
			if (opt.equalsIgnoreCase("autostrada")) {
				return 130;
			}

			return 0;


	}

}
