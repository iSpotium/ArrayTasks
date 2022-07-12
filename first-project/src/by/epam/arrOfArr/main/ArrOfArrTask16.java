package by.epam.arrOfArr.main;

import java.util.Scanner;

public class ArrOfArrTask16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = inputIntMethod();

		int array[][] = new int[n][n];
		for (int i = 0, j = 0; i < array.length; i++) {
			array[i][j] = (i + 1) * (i + 2);
			j = j + 1;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%2d]", array[i][j]);
			}
			System.out.println();
		}

	}

//////////////////////////////////////////////////////////////////////
	public static int inputIntMethod() {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("n>");
		n = sc.nextInt();

		return n;
	}
}
