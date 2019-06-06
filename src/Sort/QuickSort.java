package Sort;

import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int[] data, int low, int high) {
		int key = data[low];
		while (low < high) {
			while (low < high && data[high] >= key)
				high--;
			Sorts.swap(data, low, high);
			while (low < high && data[low] <= key)
				low++;
			Sorts.swap(data, low, high);
		}
		return low;
	}
	
	public static void quickSort(int[] data, int low, int high) {
		if (low < high) {
			int key = partition(data, low, high);
			quickSort(data, key+1, high);
			quickSort(data, low, key-1);
		}
	}
	
	public static void quickSort(int[] data) {
		quickSort(data, 0, data.length-1);
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		quickSort(array);
		System.out.println(Arrays.toString(array));
	}
}
