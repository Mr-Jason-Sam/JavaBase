package Sort;

import java.util.Arrays;

public class HeapSort {
	
	public static void heapify(int[] data, int start, int end) {
		int parent = start;
		int child = 2*parent+1;
		while (child <= end) {
			if (child+1 <= end && data[child] < data[child+1])
				child++;
			if (data[child] > data[parent]) {
				Sorts.swap(data, child, parent);
				parent = child;
				child = 2*child+1;
			} else
				return;
			
		}
	}
	
	public static void heapSort(int[] data) {
		//堆化
		for (int i = data.length/2-1; i >= 0; i--)
			heapify(data, i, data.length-1);
		
		for (int i = data.length-1; i >= 0; i--) {
			Sorts.swap(data, i, 0);
			heapify(data, 0, i-1);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		heapSort(array);
		System.out.println(Arrays.toString(array));
	}
}
