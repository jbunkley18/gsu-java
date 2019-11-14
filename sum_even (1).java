package recursion;

public class sum_even {
	public static long sum(int[] A, int index){
		if (index < 0 || A.length <=1){
			return 0;
		}
		
		if (index %2==1){
				long s = sum(A, index -2);
				return s+A[index];
				
			}else{
				return sum(A, index - 1);
		}
		
	}
	public static void main(String[] args) {
		int [] A = {1,2,5,9};
		System.out.println(sum(A,A.length-1));
	}

}
