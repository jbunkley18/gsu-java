public class multiplyDriver {
    public static void main(String[] args){
        System.out.println(multiply(10,3));
    }

    public static int multiply(int a, int b){
        int multi = 0;
        //you want to add a to multi b times
        //base case is when b is 0
        while (b > 0){
            multi = multi + a;
            return multiply(a, b -1);
        }
    }
}
