public class ShapeDriver {
    public static void main(String[] args){
        Sphere s= new Sphere(2.5);
        Circle c = new Circle(2);
        Cube b = new Cube (2, 3.45 ,4);

        s.print();
        System.out.println("~~~~~~~~~~~~~~");
        c.print();
        System.out.println("~~~~~~~~~~~~~~");
        b.print();
        System.out.println("~~~~~~~~~~~~~~");

    }
}
