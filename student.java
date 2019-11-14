public class student extends person{
    public student(){
        private double GPA;

        super("Dominique", "Moses", 24);

        public student(String first, String last, int age, double GPA){
            super(first, last, age);
            this.GPA = GPA;
        }

    }
}