public class Homework4 {
    public static void main(String[] args){
        System.out.println(multiply(5,3));
        System.out.println(multiply(0,7));
        System.out.println(multiply(11,11));
        writeSquares(11);
    }

    public static int multiply(int a, int b){
        //base case
        if (a == 0 || b == 0){ return 0;}
        //recursive case
        else {
            return a + multiply(a, b -1);
        }
    }

    public static void writeSquares(int n){

        //base cases
        if (n == 0){
            return;
        }

        if (n == 1){
            System.out.print(1);
            return;
        }

        //recursive cases
        if (n%2 ==0){
            System.out.print(n*n + ", ");
        }
        writeSquares(n-1);

        if (n%2 != 0){
            System.out.print(", " + n*n);
        }
    }
}
