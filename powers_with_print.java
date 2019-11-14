package recursion;

public class powers_with_print {
	public static long power(int base,int exp){
		if (exp == 0){
			int r = 1;
			System.out.println(" base "+base+" exp "+exp+" = "+r);
			return r;
		}
		else{
		long r= base*power(base,exp-1);
		System.out.println(" base "+base+" exp "+exp+" = "+r);
		return r;
		}
	
	}
	public static void main(String[] args) {
		System.out.println(power(2, 5));
	}
}
