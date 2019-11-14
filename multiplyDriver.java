public class Homework4 {
    public static void main(String[] args){
        System.out.println(multiply(5,3));
    }

    public static int multiply(int a, int b){
        //base case
        if (a == 0 || b == 0){ return 0;}
        //recursive case
        else {
            return a + multiply(a, b -1);
        }
    }
}
