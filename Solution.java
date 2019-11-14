import java.util.*;
class Solution {
    public static void main(String[] args){
        String s = "--name abcde";
        System.out.println(solution(s));
    }
    public static int solution(String S) {
        //check if there is at least one valid parameter (contains --)
        if (!S.contains("--")) {return -1;}

        //convert String to lowercase
        S.toLowerCase();
        S.replaceAll("\\s","");

        //divide up into substrings 
        String[] split = S.split("--");

        
        //first entry is blank, so start at index 1
        //check if valid parameters for each entry
        for (int i = 1; i < split.length; i++){

            if (split[i].contains("count")){
                if (split[i].length() < 15 || split[i].length() > 110) {return -1;}
                String sub = split[i].substring(5);
                //if there is a non integer, return -1
                if(split[i].contains("name")){
                    //following must be only 3 to 10 characters
                    if (split[i].length() < 7 || split[i].length() > 14) {return -1;}
                    //check for letters only
                    else if (!split[i].matches("[a-zA-Z]+")){return -1;}
                } 
                if(split[i].contains("help")) {return 1;}
            }
            
        }
        return 0;


    }
}