package by.tasks.oneDimensionalArrays.main; // Даны целые числа а1 ,а2 ,..., аn . 

//Вывести на печать только те числа, для которых аi > i.

import java.util.Random;

public class OneDimArrTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(5);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);

		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.printf("[%2d]", arr[i]);
			}
		}
		
	}
}