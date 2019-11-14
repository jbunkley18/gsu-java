package recursion;

public class char_find {
public static boolean find(String S, char c){
	if (S==""){
		return false;
	}
	else if(S.length()==1) {
		return (S.charAt(0)==c);
	}else{
		return ((S.charAt(0)==c)||find(S.substring(1),c));
	}
}
public static void main(String[] args) {
	System.out.println(find("a",'b'));
	System.out.println(find("a",'a'));
	System.out.println(find("abc",'z'));
	System.out.println(find("abc",'c'));
	System.out.println(find("abc",'a'));
}
}
