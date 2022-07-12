package by.epam.arrOfArr.main;

public class ArrOfArrTask07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][] { { 6, 5, 7, -8, -1 }, { 5, 6, -7, 2, 4 }, { -4, -8, -2, 3, 7 }, { 7, 5, 2, 2, -3 },
				{ -1, -9, 6, 3, 1 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((arr[i][j] < 0) && (arr[i][j] % 2 != 0)) {
					sum = sum + Math.abs(arr[i][j]);
					System.out.printf("[%2d]", arr[i][j]);
				}
			}
		}
		System.out.println("\nsum = " + sum);
	}

}
