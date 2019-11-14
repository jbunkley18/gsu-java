package Lab5;

public class studentClient {
    public static void main(String[] args){
        Undergraduate Alex = new Undergraduate("Computer Science", 3.9, 54, true);
        Graduate Mary = new Graduate("Computer Science", 4.10, 0, "masters", "Cybersecurity", 1);
        Exchange Francisca = new Exchange("Mathematics", 3.7, 30, true, "Brazil", "Summer 2018");

        //Alex's Info
        System.out.println("Student Name: Alex");
        System.out.println("Year: " + Alex.getYear());
        System.out.println("Major: " + Alex.getMajor());
        System.out.println("GPA: " + Alex.getGpa());
        System.out.print("Honors Student? ");
        if (Alex.isHonors()) { System.out.println("Yes"); }
        else { System.out.println("No"); }
        System.out.println();

        //Mary's Info
        System.out.println("Student Name: Mary");
        System.out.println("Years: " + Mary.getYears());
        System.out.println("Major: " + Mary.getMajor());
        System.out.println("Concentration: " + Mary.getConcentration());
        System.out.println();

        //Francisca's Info
        System.out.println("Student Name: Francisca");
        System.out.println("Country of Origin: " + Francisca.getCountry());
        System.out.println("Major: " + Francisca.getMajor());
        System.out.println("GPA: " + Francisca.getGpa());
    }
}