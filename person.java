//demonstrating inheritance

public class person{
     String first, last;
     int age;

    //constructors
    public person(String first, String last){
        this.first = first;
        this.last = last;
    }

    //can you use one constructor to build another one?
    public person(String first, String last, int age){
        this(first,last);
        this.age = age;
    }

    public person(){
        this("John","Doe", 0);
    }

    public int getAge(){
        return age;
    }

    public String getFirst(){
        return first;
    }

    public String getLast(){
        return last;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setFirst(String first){
        this.first = first;
    }

    public void setLast(String last){
        this.last = last;
    }

    public String toString(){
        return first + " " + last + " " + age;
    }
}
