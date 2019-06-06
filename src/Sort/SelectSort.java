package Sort;

import java.util.Arrays;

public class SelectSort {
	public static void selectSort(int[] data) {
		int min = 0, i = 0;
		for (; i < data.length; i++) {
			min = i;
			for (int j = i; j < data.length; j++) {
				if (data[min] > data[j]) {
					min = j;
				}
			}
			
			if (min != i) {
				Sorts.swap(data, i, min);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		selectSort(array);
		System.out.println(Arrays.toString(array));
	}
}
