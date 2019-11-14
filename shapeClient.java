package Shape;

public class shapeClient {
    public static void main(String[] args){
        Rectangle r = new Rectangle(1.2, 3.4);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Circle c = new Circle(3);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~");


        Triangle t = new Triangle(1, 1, 1);
        System.out.println(t.area());
        System.out.println(t.perimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Square s = new Square(1.2);
        System.out.println(s.area());
        System.out.println(s.perimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~");
    }
}
