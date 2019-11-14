import java.awt.*; 
import javax.swing.*;
class FirstExtendedFrame extends JFrame{
	
	  public FirstExtendedFrame( String title )
	  {// Your frame is a container. You are instiantiating one right now 
	    super( title );                      // invoke the JFrame constructor
	    setSize( 250, 100 );
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    
	    setLayout( new FlowLayout() );       // set the layout manager
	    // now you need to add components to this container. 
	    // All the components would appear within this bounds of your container
	    // First component is a label
	    JLabel label1 = new JLabel("My Frist Shiney Label!!");  // construct a JLabel
	    add( label1 );                        // add the label to the JFrame
	    JLabel label2 = new JLabel("Another sunny label!!");
	    add ( label2 );
	  }
}

public class TestExtendedFrame{
	public static void main(String[] args) {
		FirstExtendedFrame frame = new FirstExtendedFrame("Woot Woot!");
		frame.setVisible(true);
	}
}