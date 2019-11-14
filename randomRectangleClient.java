import java.util.*;

public class randomRectangleClient implements Comparator<Rectangle>{
    public static void main(String[] args){

        Rectangle a = new Rectangle(r(), r(), new Point(r(), r()));
        Rectangle b = new Rectangle(r(), r(), new Point(r(), r()));
        Rectangle c = new Rectangle(r(), r(), new Point(r(), r()));
        Rectangle d = new Rectangle(r(), r(), new Point(r(), r()));
        Rectangle e = new Rectangle(r(), r(), new Point(r(), r()));

        ArrayList<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(a);
        list1.add(b);
        list1.add(c);
        list1.add(d);
        list1.add(e);

        System.out.println("Unsorted List:");
        for (int i = 0; i < list1.size(); i++){
            System.out.println((list1.get(i)).toString());
        }
        System.out.println("~~~~~~~~~~");

        Collections.sort(list1);

        System.out.println("Sorted List:");
        for (int i = 0; i < list1.size(); i++){
            System.out.println((list1.get(i)).toString());
        }
    }

    //generates random int
    public static int r(){
        int r = 0;
        int max = 10; 
        int min = 1; 

        int range = max - min + 1; 
        for (int i = 0; i < 10; i++) { 
            r = (int)(Math.random() * range) + min; 
        }

        return r;
    }
}