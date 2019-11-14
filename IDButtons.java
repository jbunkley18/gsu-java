import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class IDButtons extends JPanel implements ActionListener{
    private JButton increment, decrement;
    private int numeric_value;
    private JLabel nvlabel;

    public IDButtons(){
        increment = new JButton("Increment");
        decrement = new JButton("Decrement");
        numeric_value = 50;
        nvlabel = new JLabel("Numeric Value: " + numeric_value);

        increment.addActionListener(this);
        decrement.addActionListener(this);

        add(increment);
        add(decrement);

        setBackground(Color.purple);
	    setPreferredSize(new Dimension(500, 100));
    }

    public void actionPerformed(Action event){
        Object source = event.getSource();
        if (source == decrement){
            numeric_value--;
        } else if (source==increment){
            numeric_value++;
        }
    }


}