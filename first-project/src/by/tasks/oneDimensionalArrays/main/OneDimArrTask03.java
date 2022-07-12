package by.tasks.oneDimensionalArrays.main;

import java.util.Scanner;

public class OneDimArrTask03 {

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

		if (mas[0] > 0) {
			System.out.println("positive number occurs first");
		} else if (mas[0] < 0) {
			System.out.println("a negative number occurs first");
		}
	}
}
