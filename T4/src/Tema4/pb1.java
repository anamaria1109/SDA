package Tema4;

import java.util.Scanner;

public class pb1 {
	
	private static Scanner sc;
	public static void main(String[] args) {
		int[] sir = {12,25,47,58,47,7,96,14,3,9};
		afisArray(sir,10);
		System.out.println("Introduce-ti pozitia intre 0-9: ");
		sc = new Scanner(System.in);
		int pozitie = sc.nextInt();
		while(pozitie < 0 || pozitie > 9)
		{
			System.out.println("Pozitia introdusa este gresita. Incearca din nou: ");
			pozitie = sc.nextInt();
		}
		System.out.println("Introduce-ti numarul care urmeaza sa fie introdus in sir: ");
		int numar = sc.nextInt();
		int[] newSir = new int[11];
		int index = 0;
		int indexNou = 0;
		while(indexNou < 11)
		{
			if(indexNou != pozitie)
			{
				newSir[indexNou++] = sir[index++];
			}
			else
			{
				newSir[indexNou++] = numar;
				
			}
		}
		afisArray(newSir,11);
		
		}
		public static void afisArray(int[] sir, int length)
		{
			System.out.println("Lista este: ");
			System.out.print("[ ");
			for(int i = 0; i < length-1; i++)
			{
				System.out.print(sir[i] + ", ");
			}
			System.out.println(sir[length-1] + "]");
		}
	

}
