package Shape;

public class quizDriver {
    public static void main(String[] args) {
        Meg[] elements = {new Lois(), new Meg(), new Brian()};
        for(int i = 0; i< 3;i++) {
            elements[i].a();
            System.out.println();
            elements[i].b();
            System.out.println();
            System.out.println(elements[i]);
            System.out.println();
        }

        Meg m = new Brian();
        Brian x = (Brian) m;
        System.out.println(x.name);

    }
}
