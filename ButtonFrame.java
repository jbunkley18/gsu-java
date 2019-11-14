import java.awt.*;
import javax.swing.*;

public class ButtonFrame extends JFrame{
    JButton bChange;

    //constructor
    public ButtonFrame(String title){
        super(title);
        setLayout(new FlowLayout());

        bChange = new JButton("Click me!");
        add(bChange);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}