import javax.swing.JFrame;

public class IncrementDecrement{
    public static void main(String[] args){
        JFrame frame = new JFrame("Increment or Decrement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        IDButtonsPanel panel = new IDButtonsPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}