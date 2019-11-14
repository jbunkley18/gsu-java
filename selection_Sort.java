package sorts;
import java.util.*;
public class selection_Sort {
	public static void swap(int i, int j, int []A) {
		int tmp = A[j];
		A[j]=A[i];
		A[i]=tmp;
	}
	public static void sort(int [] A) {
		for (int i = 0; i < A.length; i++) {
			double min = Double.POSITIVE_INFINITY;
			int ind = i;
			for (int j = i+1; j < A.length; j++) {
				if (min > A[j]) {min = A[j]; ind = j; }
			}
			swap(i,ind,A);
		}
	}
	public static void main(String[] args) {
		int [] A = {5,4,3,2,1};
		System.out.println("Array before sorting:"+Arrays.toString(A));
		sort(A);
		System.out.println(Arrays.toString(A));
	}

}
