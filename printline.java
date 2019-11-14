package recursion;

public class printline {
	public static void printLine(String c, int n){
		if (n == 0){
			System.out.println();
			//return;
		}else{
		System.out.print(c);
		printLine(c,n-1);
		//return;
		}
	}
	public static void main(String[] args) {
		printLine("XD ", 30);
		printLine("-->", 30);
		
	}
}
