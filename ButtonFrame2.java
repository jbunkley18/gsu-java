import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonFrame2 extends JFrame implements ActionListener{
    JButton bChange;
    public ButtonFrame2(String title){
        super(title);
        setLayout(new FlowLayout());

        bChange = new JButton("Click me!");
        bChange.addActionListener( this ); 

        add(bChange);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //listener method; add what the button will do
    public void actionPerformed(ActionEvent evt){
        getContentPane().setBackground(Color.blue);
        repaint();
    }
}