package tema1sda;

import java.io.*;

	public class maint1 { 
		
		public static void main(String[] args) throws IOException
		{
			int a, b, adunare, scadere, inmultire, distanta, max, min;
			double medie;
			
			System.out.println("Scrie doua numere ");
			System.out.println("Primul numar: ");
			
			BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	
			a = Integer.parseInt(x.readLine());

			System.out.println("Al doilea numar: ");
			b = Integer.parseInt(x.readLine());
			
			adunare = a + b;
			System.out.println("Adunarea celor doua numere: " + adunare);
			
			scadere = a - b;
			System.out.println("Scaderea celor doua numere: " + scadere);
			
			inmultire = a * b;
			System.out.println("Inmultirea celor doua numere: " + inmultire);
			
			medie = (a + b) / 2;
			System.out.println("Media aritmetica a celor doua numere: " + String.format("%.2f", medie));
			
			if(a < b)
			{
				max = b;
				min = a;
			}
			else
			{
				max = a;
				min = b;
			}
			
			distanta = max - min;
			
			System.out.println("Distanta dintre numere: " + distanta);
			System.out.println("Numarul cel mai mare este: " + max);
			System.out.println("Numarul mai mic este: " + min);
			
		}
	
	}

