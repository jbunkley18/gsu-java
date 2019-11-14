package recursion;

public class print_nums {
	public static void Print(int n){
		if (n == 1){
			System.out.print(n+" ");
		}else{
			Print(n-1);
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		Print(10);
	}

}
