
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;
class ColorPanel extends JPanel implements ChangeListener, ActionListener
{
   private JPanel controls, color;
   private JSlider rSlider;
   private JLabel rLabel;
   private JRadioButton red, green;
   private String selection = "red";
   //-----------------------------------------------------------------
   //  Sets up the sliders and their labels, aligning them along
   //  their left edge using a box layout.
   //-----------------------------------------------------------------
   public ColorPanel()
   {
      rSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
      rSlider.setMajorTickSpacing(50);
      rSlider.setMinorTickSpacing(10);
      rSlider.setPaintTicks(true);
      rSlider.setPaintLabels(true);
      rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);		


      
      rSlider.addChangeListener(this);

      rLabel = new JLabel(": 0");
      rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      
      // Add two new radio buttons  
      //red = new JRadioButton(?);
      //green = ?;
      //red.addActionListener(?);
      //green.addActionListener(?);
      
      //add these two buttons to the button group
      //ButtonGroup group = new ButtonGroup();
      //group.add(?);
      //group.add(?);
      
      controls = new JPanel();
      BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
      controls.setLayout(layout);
      // add the two radio buttons to controls
      //controls.add(?);
      //controls.add(?);
      controls.add(rLabel);
      controls.add(rSlider);

      color = new JPanel();
      color.setPreferredSize(new Dimension(100, 100));
      color.setBackground(new Color(0, 0, 0));
      
      add(controls);
      add(color);
   }

   //*****************************************************************
   //  Represents the listener for all three sliders.
   //*****************************************************************
      //--------------------------------------------------------------
      //  Gets the value of each slider, then updates the labels and
      //  the color panel.
      //--------------------------------------------------------------
      public void stateChanged(ChangeEvent event)
      {
       int c;
    	  
       c = rSlider.getValue();
         
      if (this.selection=="red") {
         rLabel.setText("Red: " + c);
         color.setBackground(new Color(c,0, 0));
      }else if (this.selection =="green"){
    	  //rLabel.setText(?);
    	  //color.setBackground(?);
      }
      }
   

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		rSlider.setValue(0);
		color.setBackground(new Color(0,0,0));
		
		if (source == red) {
			// you are changing the string variable selection for this. hint: read stateChanged method, where it tells you what these values should be! 
			//this.selection = ?;
		}else {
			//? write code here 
		}
		System.out.println(this.selection);
	}
}		

public class OneSlider {
	 public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Color fill");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame.getContentPane().add(new ColorPanel());

	      frame.pack();
	      frame.setVisible(true);
	   }   
}
