import javax.swing.JFrame;
public class Farenheit{
    public static void main(String[] args){
        JFrame frame = new JFrame("Farenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FarenheitPanel panel = new FarenheitPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}