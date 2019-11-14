package Lab6;

public class ColoredPointClient {
    public static void main(String[] args) {
        //declare ColoredPoint objects, print, declare if they're equal
        ColoredPoint a = new ColoredPoint(1, 2, "blue");
        ColoredPoint b = new ColoredPoint(1, 2, "red");
        ColoredPoint c = new ColoredPoint(1, 2, "blue");
        ColoredPoint d = new ColoredPoint(3, 5, "yellow");
        Point hello = new Point(1, 2);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(hello.toString());

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equals(hello));
    }
}
