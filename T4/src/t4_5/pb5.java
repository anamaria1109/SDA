package t4_5;

import java.util.Random;
import java.util.Scanner;


public class pb5 {

	public static void main(String[] args)
	{
		int n;
		int m;
		System.out.println("Introduceti dimensiunile matricei");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] imagine = new int[n][m];
	
		for(int i = 0; i < n; ++i)
		{
			for(int j = 0; j < m; ++j)
				imagine[i][j] = new Random().nextInt(255);
		}
		afisImagine(imagine,n,m);
		filtruNetezire(imagine,n,m,0,0);
		afisImagine(imagine,n,m);
	}
	public static void afisImagine(int[][] imagine,int n,int m)
	{
		for(int i = 0; i < n; ++i)
		{
			for(int j = 0; j < m; ++j)
			{
				System.out.print(imagine[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void filtruNetezire(int[][] imagine,int n,int m, int iMin,int jMin)
	{
		System.out.println("iMin : " + iMin + "   jMin: " + jMin);
		int suma = 0;
		int contor = 0;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j <3; j++)
			{
				if(iMin + i < n && jMin + j < m)
				{
					contor++;
					suma += imagine[iMin+i][jMin+j];
				}
				
			}
		}
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j <3; j++)
			{
				if(iMin + i < n && jMin + j < m)
				 imagine[iMin+i][jMin+j] = suma/contor;
			}
		}
		if(iMin+3 < n)
			filtruNetezire(imagine,n,m,iMin+3,jMin);
		if(jMin+3 < m)
			filtruNetezire(imagine,n,m,0,jMin+3);
		
	}

}
