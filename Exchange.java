package Lab5;

public class Exchange extends Undergraduate{
    private String country;
    private String year;

    public Exchange(String major, double gpa, int creditHours, boolean honors, String country, String year){
        super(major, gpa, creditHours, honors);
        this.country = country;
        this.year = year;
    }

    public String getCountry(){
        return country;
    }
    public String getExchangeYear() {
        return year;
    }
}
