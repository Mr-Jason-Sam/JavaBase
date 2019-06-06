package Sort;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] r){
	    mergeSortRecursive(r, r.clone(), 0, r.length - 1);
	}

	public static void mergeSortRecursive(int arr[], int reg[], int start, int end) {
	    if (start >= end)
	        return;
	    int len = end - start, mid = (len >> 1) + start;
	    int start1 = start, end1 = mid;
	    int start2 = mid + 1, end2 = end;
	    mergeSortRecursive(arr, reg, start1, end1);
	    mergeSortRecursive(arr, reg, start2, end2);
	    int k = start;
//	    System.out.println(start1+","+end1+","+start2+","+end2);
	    while (start1 <= end1 && start2 <= end2)
	        reg[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
	    while (start1 <= end1)
	        reg[k++] = arr[start1++];
	    while (start2 <= end2)
	        reg[k++] = arr[start2++];
	    for (k = start; k <= end; k++)
	        arr[k] = reg[k];
//	    System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
}
