import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FarenheitPanel extends JPanel{
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField farenheit;

    //constructor
    public FarenheitPanel(){
        inputLabel = new JLabel("Enter Farenheit temperature:");
        outputLabel = new JLabel("Temprature in Celsius: ");
        resultLabel = new JLabel("---");

        farenheit = new JTextField(5);
        //add listener for farenheit
        farenheit.addActionListener(new TempListener());

        add(inputLabel);
        add(farenheit);
        add(outputLabel);
        add(resultLabel);

        setPreferredSize(new Dimension(300, 75));
        setBackground(Color.cyan);
    }

    private class TempListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            int farenheitTemp, celciusTemp;
            String text = farenheit.getText();
    
            farenheitTemp = Integer.parseInt(text);
            celciusTemp = (farenheitTemp - 32) * 5/9;
    
            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }
}

