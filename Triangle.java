package Shape;

public class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}

    public void setA(){this.a = a;}
    public void setB(){this.b = b;}
    public void setC(){this.c = c;}

    public double area(){
        double s = 0.5 * this.perimeter();
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double perimeter(){ return a + b + c;}
}
