public class Lab8{
    public static void main(String[] args){
        System.out.println(mystery(7,12));
        //Returned value: 7

        System.out.println(mystery(37,8));
        //Returned value: 5

        System.out.println(mystery(8,2));        
        //Returned value: 0

        printN(10);

        System.out.println(cumulativeSum(10));

        System.out.println(fib(4) + " " + fib(6) + " " + fib(8) + " " + fib(10));
    }

    //Q1
    public static int mystery(int x, int y){
        if (x<y){
            return x;
        } else {
            return mystery(x-y,y);
        }
    }

    //Q2
    public static void printN(int n){
        if (n == 0) { System.out.println();}
        else {
            if (n > 1) {
                System.out.print(n + " ");
            } else {
                System.out.print(n);
            }
            printN(n-1);
        }
    }

    //Q3
    public static int cumulativeSum(int n){
        if (n == 0) { return 0;}
        else {
            return n + cumulativeSum(n-1);
        }
    }

    //Q4
    public static int fib(int n){
        if (n == 1 || n == 2){return 1;}
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}
