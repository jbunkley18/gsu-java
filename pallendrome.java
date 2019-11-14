package recursion;

import java.util.ArrayList;

public class pallendrome {
	public static boolean isPallindrome(String s){
		if (s.length()< 2){
			return true;
		}else{
			return (s.charAt(0)==s.charAt(s.length()-1) && isPallindrome(s.substring(1,s.length()-1)));
		}
	}
	public static void main(String[] args) {
		String [] S = {"","a","ab","aa","aba","abb"};
		 for (String s : S) {
			 System.out.println(s+" "+isPallindrome(s));
			
		}
	}

}
