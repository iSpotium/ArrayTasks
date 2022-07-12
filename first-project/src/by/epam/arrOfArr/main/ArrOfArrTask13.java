package by.epam.arrOfArr.main;

import java.util.Scanner;

public class ArrOfArrTask13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc = new Scanner(System.in);

		int n;
		System.out.print("Enter an even number n> ");
		n = sc.nextInt();

		int arr[][] = new int[n][n];
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		int element = n + 1;
		int temp = 0;
		for (int i = 1; i < arr.length; i = i + 2) {
			for (int j = 0; j < arr[i].length; j++) {
				temp++;
				arr[i][j] = element - temp;
			}
			temp = 0;

		}

		for (int i = 0; i < arr.length; i = i + 2) {
			for (int j = 0; j < arr[i].length; j++) {
				temp++;
				arr[i][j] = temp;
			}
			temp = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}

	}
}