import java.util.*;

public class MedRecordsClient implements Comparable<MedRecords>{
    public static void main(String[] args){
        ArrayList<MedRecords> records = new ArrayList<MedRecords>();
        records.add(new MedRecords("Jennifer", 25, "O"));
        records.add(new MedRecords("James", 29, "A"));
        records.add(new MedRecords("Yvonne", 56, "O"));
        records.add(new MedRecords("Paris", 16, "B"));
        records.add(new MedRecords("Helena", 42, "O"));
        records.add(new MedRecords("Jennifer", 23, "A"));
        records.add(new MedRecords("Sebastian", 36, "B"));
        records.add(new MedRecords("Chris", 39, "0"));
        records.add(new MedRecords("Chris", 39, "A"));
        records.add(new MedRecords("James", 25, "A"));

        Collections.sort(records);
        System.out.println(records.toString());

    }
}