package by.epam.arrOfArr.main;

import java.util.Scanner;

public class ArrOfArrTask17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = inputIntMethod();

		int[][] arr = new int[n][n];
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i == arr.length - 1) || (i == 0)) {
					arr[i][j]++;
				} else if ((i > 0) && (i < arr.length - 1)) {
					arr[i][j = arr[i].length - 1]++;
					arr[i][0]++;
				}
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
