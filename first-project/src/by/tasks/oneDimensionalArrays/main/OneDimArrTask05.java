package by.tasks.oneDimensionalArrays.main;

public class OneDimArrTask05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas1 = new int[3];
		mas1[0] = 24;
		mas1[1] = 16;
		mas1[2] = 11;
		int count = 0;

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] % 2 == 0) {
				count++;
			}
		}
		int mas2[] = new int[count];
		for (int i = 0, j = 0; i < mas1.length; i++) {
			if (mas1[i] % 2 == 0) {
				mas2[j] = mas1[i];
				j++;
			}
		}
		for (int j = 0; j < mas2.length; j++) {
				System.out.println( + mas2[j]);
			}
		}
	}