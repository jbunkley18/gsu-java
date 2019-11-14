public class Date implements Comparable<Object>{
 private int month, day, year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //precedence goes: year > month > day
    public int compareTo(Object y){
        Date x = (Date) y;
        if (year < x.year){ return -1;}
        else if (year > x.year){return 1;}
        else if (year == x.year){
            if (month < x.month) { return -1;}
            else if (month > x.month) {return 1;}
            else if (month == x.month) {
                if (day < x.day) {return -1;}
                else if (day > x.day) {return 1;}
                else {return 0;}
            }
        }
        return 0;
    }

    public String toString(){
        return month + "/" + day +"/" + year;
    }
}