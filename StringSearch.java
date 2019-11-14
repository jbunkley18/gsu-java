package binary_search;

import java.util.Arrays;

public class StringSearch {
	public static int search(String [] Dictionary, int low, int high, String word) {
		// base case 1 
		if (low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		int r = word.compareTo(Dictionary[mid]);
		// base case 2 
		if (r == 0) {
			return mid;
		}
		if (r < 0) {
			// word < middle word: search left array 
			return search (Dictionary, low, mid-1, word);
		}else {
			return search (Dictionary, mid+1, high, word);
		}
		
	}
	public static void main(String[] args) {
		String [] D = {"a","aa","aab","b","bb","abb"};
		Arrays.sort(D);
		System.out.println(Arrays.toString(D));
		for (String w : D) {
			System.out.println(w+search(D, 0, D.length-1,w));	
		}
	}

}
