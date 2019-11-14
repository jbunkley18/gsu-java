import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PushCounterPanel extends JPanel {
    private JButton push;
    private JLabel label;

    public PushCounterPanel(){
        push = new JButton("Generate Random Integer");
        label = new JLabel();
        push.addActionListener(new ButtonListener());
        add(push);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(500,40));
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            int random = randomInt();
            label.setText("Random Integer: " + random);
        }
    }

    private static int randomInt(){
        Random r = new Random();
        return r.nextInt(100) + 1;
    }
}