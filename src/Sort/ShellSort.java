package Sort;

import java.util.Arrays;

public class ShellSort {
	public static void shellSort(int[] data) {
		for (int d = data.length >>> 1; d > 0; d >>>= 1) {
			for (int i = d; i < data.length; i++) {
				int temp = data[i], j = i - d;
				for (; j >= 0 && data[j] > temp; j -= d) {
					data[j+d] = data[j];
				}
				data[j+d] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		shellSort(array);
		System.out.println(Arrays.toString(array));
	}
}
