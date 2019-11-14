package binary_search;

import java.util.Arrays;

public class integer_search {
 public static int search(Integer [] A, Integer val) {
	 int low = 0, high = A.length-1;
	 while (low <= high) {
		 int mid = (high+low)/2;
		 int r = val.compareTo(A[mid]);
		 if (r ==0) {
			 return mid;
		 }
		 if (r < 0) {
			 high = mid - 1;
		 }else{
			 low = mid + 1;
		 }
	 }
	 return -1;
 }
 public static void main(String[] args) {
	Integer [] A = {5,34,67,89,13,15,16,18};
	Arrays.sort(A);
	System.out.println(Arrays.toString(A));
	for (int i = A[0];i<=A[A.length-1];i++) {
		if (search(A,new Integer(i)) != -1) {
			System.out.println(i);
		}
	}
}
}
