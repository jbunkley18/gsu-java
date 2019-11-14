import java.util.*;
public class reverse{
    public static void main(String[] args){
        int[] list = {10, 13, 2, 8, 7, 90, -1, 2, 4, 5};
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++){
            n.add(i, list[i]);
        }

        System.out.println(reverse4(n));
        
    }   
    public static String reverse4(ArrayList<Integer> n){
        //divide arraylist into "chunks" of 4
       if (n.size() < 4){ return n.toString();}
       else {
           int sequences = n.size()/4;
           int leftovers = n.size()%4;
           for(int i = 0; i < n.size() - leftovers; i = i + 4){
               List toArrayList = n.subList(i, i+4);
               ArrayList<Integer> m = new ArrayList<Integer>();
               m.addAll(toArrayList);

               n.set(i, m.get(3));
               n.set(i + 1, m.get(2));
               n.set(i + 2, m.get(1));
               n.set(i + 3, m.get(0));

           }
           return n.toString();
       }
    }
}