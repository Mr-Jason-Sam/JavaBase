package Sort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] data) {
		boolean flag = true;
		for (int i = 0; i < data.length && flag; i++) {
			flag = false;
			for (int j = data.length; j >= i; j--) {
				if (j+1 < data.length && data[j] > data[j+1]) {
					Sorts.swap(data, j+1, j);
					flag = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
