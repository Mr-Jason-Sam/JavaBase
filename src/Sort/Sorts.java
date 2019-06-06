package Sort;

public class Sorts {
	public static void swap(int[] data, int positionA, int positionB) {
		int temp = 0;
		temp = data[positionA];
		data[positionA] = data[positionB];
		data[positionB] = temp;
	}
}
