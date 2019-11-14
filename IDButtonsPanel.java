import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IDButtonsPanel extends JPanel{
    private int value;
    private JButton increment, decrement;
    private JLabel label;

    public IDButtonsPanel(){
        value = 50;
        increment = new JButton("Increment");
        decrement = new JButton("Decrement");
        label = new JLabel();

        increment.addActionListener(new IDButtonListener());
        decrement.addActionListener(new IDButtonListener());

        add(increment);
        add(decrement);
        add(label);

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(500, 40));
    }

    private class IDButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Object source = event.getSource();
            if (source.equals(increment)) {
                value++;
                label.setText("Number: " + value);
            } else {
                value--;
                label.setText("Number: " + value);
            }
        }
    }
}