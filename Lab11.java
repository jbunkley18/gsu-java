import java.util.*;

public class Lab11 {
	
    public static void swap(int i, int j, List <Character> A) {
        Character tmp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, tmp);	
    }

    public static void insertionSort(List <Character> A) {
        int count = 0;
        int swap = 0;
        for(int i=1; i<A.size();i++){
            char key = A.get(i);
            int j = i-1;
            while(j>=0 &&A.get(j)>key){
                A.set(j+1,A.get(j));
                j--;
                swap++;
            }
            A.set(j+1, key);
            count++;
        }
        System.out.println("Comparisons(insertion): " + count);
        System.out.println("Swaps(insertion): " + swap);

    }

    public static void selectionSort(List <Character> A) {
        int count = 0;
        int swap = 0;
        for (int i =0; i < A.size() -1; i++){
            int min_index = i;
            for (int j = i+1; j < A.size(); j++) {
                if (A.get(j) < A.get(min_index)){
                    min_index = j;
                }
                count++;
            }
            swap(i, min_index, A);
            swap++;
        }
        System.out.println("Comparisons(selection): " + count);
        System.out.println("Swaps(selection): " + swap);


    }

    public static void bubbleSort(List <Character> A) {
        int count = 0;
        int swap = 0;
        for (int i = 0; i < A.size(); i++){
            for (int j = 0; j < A.size() - i - 1; j++){
                if (A.get(j) > A.get(j+1)){
                    swap(j, j+1, A);
                    swap++;
                }
                count++;
            }
        }
        System.out.println("Comparisons (bubble): " + count);
        System.out.println("Swaps (bubble): " + swap);

    }
    public static void main(String[] args) {
        List <Character> A = new ArrayList(Arrays.asList('a','b','c','d','e'));
        List <Character> B = new ArrayList(Arrays.asList('e','d','c','b','a'));
        insertionSort(B);
        System.out.println("output of insertion sort");
        System.out.println(B);
        B = Arrays.asList('e','d','c','b','a');
        //
        selectionSort(B);
        System.out.println("output of selection sort");
        System.out.println(B);
        B = Arrays.asList('e','d','c','b','a');
        //
        bubbleSort(B);
        System.out.println("output of bubble sort");
        System.out.println(B);
        B = Arrays.asList('e','d','c','b','a');
        ////////////////////////////////////////////////
        insertionSort(A);
        System.out.println("output of insertion sort");
        System.out.println(A);
        A = Arrays.asList('a','b','c','d','e');
        //
        selectionSort(A);
        System.out.println("output of selection sort");
        System.out.println(A);
        A = Arrays.asList('a','b','c','d','e');
        //
        bubbleSort(A);
        System.out.println("output of bubble sort");
        System.out.println(A);
        A =Arrays.asList('a','b','c','d','e');
    }
}
/*Lab Questions
1 - 3. See above code.
4. The worst case time complexity for all three algorithms is O(n^2). This is because they all have two for loops (or a for loop and a while loop for insertion sort).
5. Insertion: A-4 B - 4 Selection:  A-10 B -10 Bubble: A-10 B -10
6. Insertion: A-10 B -0 Selection:  A-4 B -4 Bubble: A-10 B - 0
7. Insertion sort.
8. Selection sort.
9. Insertion
10. Modify the loops so they go from the back of the array to the front.
*/