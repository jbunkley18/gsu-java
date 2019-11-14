package Lab5;

public class Undergraduate extends Student {
    private boolean honors;

    public Undergraduate(String major, double gpa, int creditHours, boolean honors){
        super(major, gpa, creditHours);
        this.honors = honors;
    }

    public boolean isHonors(){
        return honors;
    }
}
