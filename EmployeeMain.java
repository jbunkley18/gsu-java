public class EmployeeMain{
    public static void main(String[] args) {
        Lawyer Mark = new Lawyer();
        Janitor Harry = new Janitor();
        HarvardLawyer Keisha = new HarvardLawyer();

        printEmployee(Mark);
        printEmployee(Harry);
        printEmployee(Keisha);

    }

    public static void printEmployee(Employee name){
        System.out.println("Salary: $" + name.getSalary() + "0");
        System.out.println("Hours: " + name.getHours());
        System.out.println("Vacation Days: " + name.getVacationDays());
        System.out.println("Vacation Form: " + name.getVacationForm());
        if (name instanceof Janitor) {
            Janitor janitor = (Janitor) name;
            janitor.clean();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");
    }
}