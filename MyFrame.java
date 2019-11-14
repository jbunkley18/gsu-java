import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    JPanel panel;
    JLabel label;

    //constructor
    public MyFrame(String title){
        super(title);
        setSize(150,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout()); //set layout manager
        label = new JLabel("Hello Swing!"); //create a label
        add(label); //add the label to the JFrame

    }
}
