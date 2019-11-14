package sorts;

import java.util.Arrays;

public class bubble_Sort {
	public static void swap(int i, int j, Integer []A) {
		int tmp = A[j];
		A[j]=A[i];
		A[i]=tmp;
	}
	public static void sort_min_bubble(Integer [] A) {
		for (int pass = 0; pass < A.length; pass++) {
			for (int bubble = A.length-1; bubble >pass ; bubble--) {
				if (A[bubble - 1] > A[bubble]) {
					swap(bubble - 1, bubble, A);
				}
			}
			System.out.println("pass = "+pass+" "+Arrays.toString(A));
		}
	}
	public static void sort_max_bubble(Integer [] A) {
		int swaps = 0;
		for (int pass = 0; pass < A.length; pass++) {
			for (int bubble = 0; bubble < A.length - 1 - pass; bubble++) {
				if (A[bubble] > A[bubble+1]) {
					swap(bubble, bubble + 1, A);
					swaps++;
				}
			}
			System.out.println("pass = "+pass+" "+Arrays.toString(A));
			System.out.println(swaps);
		}
		
	}
	public static void sort_min_bubble_2(Integer [] A) {
		for (int pass = 0; pass < A.length; pass++) {
			for (int bubble = A.length-1; bubble >pass ; bubble--) {
				if (A[bubble - 1].compareTo(A[bubble])>0) {
					swap(bubble - 1, bubble, A);
				}
			}
			System.out.println("pass = "+pass+" "+Arrays.toString(A));
		}
	}
	public static void main(String[] args) {
		Integer [] A = {5,4,3,2,1};
		System.out.println("Array before sorting:"+Arrays.toString(A));
		sort_min_bubble_2(A);
		System.out.println(Arrays.toString(A));
		A = new Integer [] {5,4,3,2,1};
		System.out.println("Array before sorting:"+Arrays.toString(A));
		//sort_max_bubble(A);
	}

}
