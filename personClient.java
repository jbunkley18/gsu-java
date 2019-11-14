public class personClient{
    public static void main(String[] args){
        person Bob = new person("Bob", 15);
        person OtherBob = new person("Bob", 25);
        System.out.println(Bob.compareTo(OtherBob));
        System.out.println(OtherBob.compareTo(Bob));
        System.out.println(Bob.compareTo(Bob));
    }
}