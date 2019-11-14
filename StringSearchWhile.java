package binary_search;

import java.util.Arrays;

public class StringSearchWhile {
	public static int search(String [] Dictionary, String word) {
		int low = 0, high = Dictionary.length-1;
		while (high >= low) {
			int mid = (high+low)/2;
			//System.out.println("mid "+mid);
			int r = word.compareTo(Dictionary[mid]);
			if (r == 0) {
				return mid;
			}
			else if (r < 0) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
			//System.out.println("hi "+high+"lo "+low);
		}
		return -1;
	}
	public static void main(String[] args) {
		String [] D = {"a","aa","aab","b","bb","abb"};
		Arrays.sort(D);
		System.out.println(Arrays.toString(D));
		for (String w : D) {
			System.out.println(w+search(D,w));	
		}
	}
}
