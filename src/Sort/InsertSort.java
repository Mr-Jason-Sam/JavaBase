package Sort;

import java.util.Arrays;

public class InsertSort {
	public static void insertSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			int temp = data[i], j = i-1;
			for (; j >= 0 && data[j] > temp; j--) {
				data[j+1] = data[j];
			}
			data[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		insertSort(array);
		System.out.println(Arrays.toString(array));
	}
}
