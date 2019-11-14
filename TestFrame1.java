import java.awt.*;
import javax.swing.*;

public class TestFrame1 {
	public static void main ( String[] args )
	  {
	    JFrame frame = new JFrame("My Frist Shiney Frame");
	    frame.setSize(200,100);
	    frame.setVisible( true );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    for (int i = 0; i < 200; i++) {
	    	// in order to see the frame expanding properly, and if you have a super fast processor, uncomment the following for loop
	    	// This loops does nothing, but just passes the time for doing nothing, so that human eyes can see the next iteration 
	    	//for (int tp = 0;tp < 1000000000;tp++) {} 
	    	// size of the frame determines only the length nad the width 
	    	//frame.setSize(200+i,100+i);
	    	// bounds of the frame determine the left cornet of the frame (first two integers) and the width and the height of the frame (last two integers) 
	    	frame.setBounds(i, i, 200+i, 100+i);
		}
	  }
}
