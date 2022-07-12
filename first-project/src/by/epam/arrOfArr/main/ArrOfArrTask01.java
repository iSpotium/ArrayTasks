package by.epam.arrOfArr.main;

public class ArrOfArrTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][] { { 0, 1, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 0, 1 } };

		for (int p = 0; p < arr.length; p++) {
			for (int j = 0; j < arr[p].length; j++) {
				System.out.printf("[%1d]", arr[p][j]);
			}
			System.out.println();
		}
	}

}
