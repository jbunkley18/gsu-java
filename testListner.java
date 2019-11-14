import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
class buttonWithListner extends JFrame implements ActionListener{
	// constructor
	buttonWithListner(String title){
		super (title);
		setLayout (new FlowLayout());
		setBounds (50,50, 200, 200);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		JLabel l1 = new JLabel (" painting class 101 ");
		add(l1);
		JButton b1 = new JButton("push me");
		add(b1);
		// Who is going to listen when you click the button? 
		b1.addActionListener( this );
	}
	public void actionPerformed(ActionEvent evt) {
		getContentPane().setBackground(Color.BLUE);
		repaint();
	}
}
public class testListner {
public static void main(String[] args) {
	buttonWithListner blfrm = new buttonWithListner("Painting button");
	blfrm.setVisible(true);	
}
}
