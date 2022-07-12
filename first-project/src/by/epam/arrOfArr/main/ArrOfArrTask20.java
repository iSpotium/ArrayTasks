package by.epam.arrOfArr.main;

import java.util.Scanner;

public class ArrOfArrTask20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = inputIntMethod();;

		int[][] arr = new int[n][n];
		System.out.println();
		
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j]++;
			}
		}

		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			for (int j = 0; j < arr.length - i; j++) {
				arr[i][j] = 1;

			}
		}
		
		for (int i = (n / 2); i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				arr[i][j]++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i > (n / 2 - 1)) {
				break;
			}
			for (int j = arr.length - i - 1; j < arr.length; j++) {
				arr[i][j]++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
	}

///////////////////////////////////////////////////////////////////
	public static int inputIntMethod() {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("n>");
		n = sc.nextInt();

		return n;
	}
}
