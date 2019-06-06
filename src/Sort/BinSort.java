package Sort;

import java.util.Arrays;

public class BinSort {
	public static void binSort(int[] data){
	    int head,tail,mid,temp;
	    for (int i = 1; i < data.length; i++) {
	        temp = data[i];
	        head = 0;
	        tail = i - 1;
	        while(head <= tail) {
	            mid = (head+tail) >>> 1;
	            if (data[mid] > temp)
	                tail = mid - 1;
	            else
	                head = mid + 1;
	        }
	        for (int j = i -1; j >= head; j--)
	        	data[j+1] = data[j];
	        data[head]= temp;
	    }
	}
	
	public static void main(String[] args) {
		int[] array = {10, 6, 3, 5, 7, 8, 2, 1, 4, 9};
		binSort(array);
		System.out.println(Arrays.toString(array));
	}
}
