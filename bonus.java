public class bonus {
    public static void main(String[] args) {
        String name = "hello";
        System.out.println(reverse(name));
    }

    public static String reverse(String s) {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            newS = newS + (s.charAt(s.length() - 1 - i));
        }
        return newS;
    }
}
