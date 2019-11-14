import java.util.Arrays;

public class Lab10 {
    public static void main(String[] args){
        int a = 3;
        int[] x = {1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int[] y = {1, 2, 2, 4, 4, 5, 6, 7, 8, 9};

        System.out.println(sequentialSearch(a, x));
        System.out.println(sequentialSearch(a, y));
        System.out.println("~~~~~~~~~~~~");

        System.out.println(bin(a, x));
        System.out.println(bin(a, y));
        System.out.println("~~~~~~~~~~~~");

        System.out.println(rbin(0, x.length-1, a, x));
        System.out.println(rbin(0, x.length-1, a, y));
        System.out.println("~~~~~~~~~~~~");
    }

    public static int sequentialSearch(int a, int[] x){
        //perform a linear search
        for (int i = 0; i < x.length; i++){
            //if a is found, return index
            if (x[i] == a){return i;} 
        } 
        //if a is not found, return -1
        return -1;
    }

    public static int bin(int target, int[] x){
        int low = 0;
        int high = x.length - 1;

        while (low <= high) {
            int mid = (low+high)/2;
            //return index of target if found
            if (x[mid] < target) {
                low = mid + 1;
            } 
            else if (x[mid] > target) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }

        //return (insertionpoint - 1) if target not found
        int insertionPoint = Arrays.binarySearch(x, target);
        return insertionPoint - 1;

    }

    public static int rbin(int low, int high, int target, int[] x){
        //base case
        if (low > high) {return -1;}
        else {
            int mid = (low + high)/2;
            if (x[mid] < target){
                return rbin(mid + 1, high, target, x);
            }
            else if (x[mid] > target){
                return rbin(low, mid - 1, target, x);
            } 
            //other base case
            else {
                return mid;
            }
        }
    }
}