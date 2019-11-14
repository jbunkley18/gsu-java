import java.awt.*;
import javax.swing.*;

class FirstButton extends JFrame{
	public FirstButton (String title){
		super( title );
		// Layout manager is the guy responsible for arranging the layouts 
		setLayout( new FlowLayout() );
		//setLayout ( new GridLayout() );
		//setLayout ( new GridBagLayout() );
		// set basic stuff for your container
		setBounds( 200, 100, 500, 500);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		// add a label component to the container
		JLabel l = new JLabel("Hey y'all\n");
		add(l);
		JButton b = new JButton("Shiney click");
		add(b);
		JButton b2 = new JButton(" another click");
		add (b2);
	}

}
public class TestFirstButton{
	public static void main(String[] args) {
		FirstButton fb = new FirstButton("button good");
		fb.setVisible( true );
	}
}
// check out more layouts at https://www.tutorialspoint.com/swing/swing_layouts.htm