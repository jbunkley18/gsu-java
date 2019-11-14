public class Sphere implements Shape, Print {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double surface(){
        return 4*Math.PI*radius*radius;
    }

    public double volume(){
        return (4.0/3.0)*Math.PI*radius*radius*radius;
    }

    public void print(){
        System.out.println("Radius: " + radius);
        System.out.println("Surface Area: " + this.surface());
        System.out.println("Volume: " + this.volume());
    }
}
