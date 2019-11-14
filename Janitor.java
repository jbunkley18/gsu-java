public class Janitor extends Employee{
    public int getHours(){
        return 2*super.getHours();
    }
    public double getSalary(){
        return super.getSalary() - 10000.0;
    }
    public int getVacationDays() {
        return super.getVacationDays()/2;           // 2 weeks' paid vacation
    }
    public void clean(){
        System.out.println("Cleaning!");
    }
}