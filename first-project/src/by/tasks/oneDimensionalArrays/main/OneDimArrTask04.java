package by.tasks.oneDimensionalArrays.main;

import java.util.Scanner;

public class OneDimArrTask04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int[] mas = new int[3];
		sc = new Scanner(System.in);

		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=>");
			mas[i] = sc.nextInt();
		}
		System.out.println();

		if ((mas[0] > mas[1]) && (mas[1] > mas[2])) {
			System.out.println("descending sequence of numbers");
		} else if ((mas[0] < mas[1]) && (mas[1] < mas[2])) {
			System.out.println("increasing sequence of numbers");
		} else {
			System.out.println("sequence of numbers neither ascending nor non-decreasing");
		}

	}
}
