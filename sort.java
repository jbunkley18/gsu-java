import java.util.Arrays;
public class sort{
    public static void main(String[] args){
        int[] A = {12, 3, 4, 4, 7, 8, 10, 12, 35, -8};
        bubbleSort(A);

        System.out.println(Arrays.toString(A));
    }

    public static void bubbleSort(int[] A){
        for (int i = 0; i < A.length; i++){
            for (int j = i + 1; j < A.length; j++){
                if (A[j] < A[i]){
                    int tmp = A[j];
                    A[j] = A[i];
                    A[i] = tmp;
                }
            }
        }
    }
}