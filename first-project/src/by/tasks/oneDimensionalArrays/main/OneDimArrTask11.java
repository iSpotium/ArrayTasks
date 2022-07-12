package by.tasks.oneDimensionalArrays.main;

import java.util.Random;

public class OneDimArrTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int arr[] = new int[6]; 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(2000);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("[%1d]", arr[i]);
		}
		System.out.println();
		
		int m = 7;
		int l = 2;
		for(int i = 0; i < arr.length; i++) {
			if(((l > 0) && (l < m - 1)) && (arr[i] % m == l)) {
				System.out.printf("[%1d]\n", arr[i]);
			}else {
				System.out.println("There are no such numbers\n");
			}
		}
	}
}
