import java.util.Arrays;
public class test{
    public static void main(String[] args){
        int[] A = {5, 6, 2, 1, 3, 9, 11};
        bubbleSort(A);
        System.out.println(Arrays.toString(A));
    }

    public static void swap(int[] A, int a, int b){
        int tmp = A[a];
        A[a] = A[b];
        A[b] = tmp;
    }
    public static void selectionSort(int[] A){
        for (int i = 0; i < A.length; i++){
            int min_index = i;
            for (int j = i + 1; j < A.length; j++){
                if (A[j] < A[min_index]){
                    min_index = j;
                }
            }
            swap(A, i, min_index);
        }
    }

    public static void insertionSort(int[] A){
        for (int i = 1; i < A.length; i++){
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }

    public static void bubbleSort(int[] A){
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length-i-1; j++){
                if (A[j] > A[j+1]){
                    swap(A, j, j+1);
                }
            }
        }
    }
}