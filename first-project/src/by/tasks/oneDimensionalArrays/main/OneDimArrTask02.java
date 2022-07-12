package by.tasks.oneDimensionalArrays.main;

import java.util.Random;

public class OneDimArrTask02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas = new int[10];
		Random rand = new Random();
		int Zero = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(3);
			System.out.printf("[%3d]", mas[i]);
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				Zero++;
			}
		}
		int[] ZeroArr = new int[Zero];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				ZeroArr[j++] = i;
			}
		}
		for (int i = 0; i < ZeroArr.length; i++) {
			System.out.printf("[%3d]", ZeroArr[i]);
		}
	}
}