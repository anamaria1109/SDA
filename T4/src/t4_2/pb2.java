package t4_2;

import java.util.Arrays;
import java.util.Scanner;


public class pb2 {

	 public static void main(String[] args) {
	        

	        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        int position = -1;
	        System.out.println("Enter a number between 0 and 9 to set: ");
	        while (position < 0 || position > 9) {
	            while(!new Scanner(System.in).hasNextInt()) {
	                new Scanner(System.in).next();
	            }
	            System.out.println("Enter a number between 0 and 9: ");
	            position = new Scanner(System.in).nextInt();
	        }

	        int n = myArray.length-1;
	        for (int i = position; i < n; i++) {
	            myArray[i] = myArray[i+1];
	        }

	        myArray[n] = 0;
	        System.out.println(Arrays.toString(myArray));

	    }
}
