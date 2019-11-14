package sorts;

import java.util.Arrays;

public class insertion_Sort {
	public static void swap(int i, int j, Integer []A) {
		int tmp = A[j];
		A[j]=A[i];
		A[i]=tmp;
	}
	public static void sort(Integer [] A) {
		for (int i = 1; i < A.length; i++) {
			int back = i-1;
			Integer val = A[i];
			while(back >= 0 && A[back]>val) {
					swap(back,back+1,A);
					back -= 1;
			}
			System.out.println(back);
		}
	}
	
	public static void sort2(Integer [] A) {
		for (int i = 1; i < A.length; i++) {
			int back = i-1;
			Integer val = A[i];
			while(back >= 0 && A[back]>val) {
					A[back+1]=A[back];
					back -= 1;
			}
			// less redundant copying
			A[back+1]=val;
			System.out.println(back);
		}
	}
	public static void main(String[] args) {
		Integer [] A = {10,9,7,8};
		sort(A);
		System.out.println(Arrays.toString(A));
	}
}
