package Lab6;

public class ColoredPoint extends Point implements Colored {
    private String color;

    public ColoredPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }
    //override toString method, have coordinates and color
    public String toString(){
        return "(" + getX() + "," + getY() +")\n" +  "color: " + color;
    }

    public String getColor(){
        return this.color;
    }
    //override equals method, include color comparison
    public boolean equals(Object o){
        if (o instanceof ColoredPoint){
            ColoredPoint other = (ColoredPoint) o;
            return getX() == other.getX() && getY() == other.getY() && other.color.equals(this.color);
        } else {
            return false;
        }
    }
}
