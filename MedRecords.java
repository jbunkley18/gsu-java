
public class MedRecords implements Comparable<MedRecords>{
    private String name, bloodType;
    private int age;

    public MedRecords(String name, int age, String bloodType){
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;

    }

    public void setName(String x){
        name = x;
    }

    public void setBloodType(String x){
        bloodType = x;
    }

    public void setAge(int x){
        age = x;
    }

    public String getName(){
        return name;
    }
    public String getBloodType(){
        return bloodType;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Name: " + getName() + "; Age: "  + getAge() + "; Blood Type: " + getBloodType();
    }

    public int compareTo(MedRecords other){
     //name > age > blood type
        if (!(this.name).equals(other.name)){
            if ((this.name).compareTo(other.name) > 0){
                return 1;
            } else {
                return -1;
            }    
        } 

        else if (this.age != other.age){
            if (this.age < other.age) {
                return -1;
            } else { return 1;}
        }

        else if ((this.bloodType).compareTo(other.bloodType) > 0){return -1;}
        else if ((this.bloodType).compareTo(other.bloodType) < 0){return 1;}
    
        return 0;
    }
}