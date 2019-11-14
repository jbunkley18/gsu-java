import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Combobox extends JPanel implements ActionListener{
	JLabel selection = new JLabel("Choose your option");
	JLabel picture = new JLabel();

	public Combobox() {
		String[] petStrings = { "rabbit", "kitten", "puppy", "chipmunk"};
		JComboBox petList = new JComboBox(petStrings);
		petList.addActionListener(this);
		picture.setPreferredSize(new Dimension(200, 200));
		add(selection);
		add(petList);
		add(picture);
	}
   
	 /** Listens to the combo box. */
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
		String petName = (String)cb.getSelectedItem();
		selection.setText("You selected "+petName);
		ImageIcon icon = new ImageIcon(petName+".jpg");
	    picture.setIcon(icon);
		 
    }
}

public class SimpleJcomboBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cute Pets");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Combobox c = new Combobox();
		frame.getContentPane().add(c);
		frame.pack();
		frame.setVisible(true);
	}
}
