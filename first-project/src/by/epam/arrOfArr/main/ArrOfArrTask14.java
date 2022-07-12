package by.epam.arrOfArr.main;

import java.util.Scanner;

public class ArrOfArrTask14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc = new Scanner(System.in);

		int n;
		System.out.print("Enter an even number n> ");
		n = sc.nextInt();

		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
	
		System.out.println();
		
		for (int i = 0, j = arr.length - 1; i < arr.length; i++) {
		      arr[i][j] = 1 + i;
		      j = j - 1;
		    }
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
	}
}
