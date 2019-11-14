import java.util.*;
public class DateTest {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList<Date>();
        dates.add(new Date(4, 13, 1743)); // Jefferson
        dates.add(new Date(2, 22, 1732)); // Washington
        dates.add(new Date(3, 16, 1751)); // Madison
        dates.add(new Date(10, 30, 1735)); // Adams
        dates.add(new Date(4, 28, 1758)); // Monroe
        System.out.println("birthdays = " + dates.toString());
        Collections.sort(dates);
        System.out.println("birthdays = " + dates.toString());
    }
}