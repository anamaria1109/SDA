package forma;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException {

		Scanner x = new Scanner(System.in);

		List<Forma> forma = new ArrayList<>();
		try {
			forma.add(new Cerc("#FFFFFF", 5, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			forma.add(new Patrat("#FFFFFF", 5, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			forma.add(new Dreptunghi("#FFFFFF", 5, 5, 10));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.print("Manual(m) or automat(a) : ");
		String y = x.nextLine();
		switch (y) {
		case "a":
			for (Forma s : forma) {
				System.out.println("Specificatii :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
						+ s.getHexFillColor());
				s.draw();
				System.out.println();
			}
			break;
		case "m":
			System.out.println("Dreptunghi(d) / Cerc(c) / Patrat(p)");
			String z = x.nextLine();
			switch (z) {
			case "d":
				for (Forma s : forma) {
					if (s.getName() == "Dreptunghi") {
						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;
			case "c":

				for (Forma s : forma) {
					if (s.getName() == "Cerc") {
						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			case "p":

				for (Forma s : forma) {
					if (s.getName() == "Patrat") {
						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			}
		}

	}



}
