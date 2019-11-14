package recursion;

public class print_nums_reverse {
public static void Print(int n){
	if (n == 1){
		System.out.print(n+" ");
	}else{
		System.out.print(n+" ");
		Print(n-1);
	}
}
public static void main(String[] args) {
	Print(10);
}
}
