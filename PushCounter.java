import javax.swing.JFrame;

public class PushCounter{
    public static void main(String[] args){
        JFrame frame = new JFrame("Generate Random Integer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PushCounterPanel panel = new PushCounterPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}