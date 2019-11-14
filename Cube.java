public class Cube implements Shape,Print {
    private double height, length, width;

    public Cube(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double surface(){
        return 2*((width*length) + (length*height) + (width*height));
    }
    public double volume(){
        return height*width*length;
    }
    public void print(){
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Surface Area: " + this.surface());
        System.out.println("Volume: " + this.volume());
    }
}
