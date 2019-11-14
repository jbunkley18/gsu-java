//********************************************************************
//  LightBulb.java       Java Foundations
//
//  Demonstrates mnemonics and tool tips.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightBulb
{
   //-----------------------------------------------------------------
   //  Sets up a frame that displays a light bulb image that can be
   //  turned on and off.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Light Bulb");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      LightBulbPanel bulb = new LightBulbPanel();
      LightBulbControls controls = new LightBulbControls (bulb);

      JPanel panel = new JPanel();
      panel.setBackground(Color.black);
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panel.add(Box.createRigidArea (new Dimension (0, 20)));
      panel.add(bulb);
      panel.add(Box.createRigidArea (new Dimension (0, 10)));
      panel.add(controls);
      panel.add(Box.createRigidArea (new Dimension (0, 10)));

      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}	

//********************************************************************
//LightBulbPanel.java       Java Foundations
//
//Represents the image for the LightBulb program.
//********************************************************************

class LightBulbPanel extends JPanel
{
private int on;
private ImageIcon lightOn, lightOff, lightDim;
private JLabel imageLabel;

//-----------------------------------------------------------------
//  Constructor: Sets up the images and the initial state.
//-----------------------------------------------------------------
public LightBulbPanel()
{
  lightOn = new ImageIcon("bulbon.png");
  lightOff = new ImageIcon("bulboff.png");
  // defnie new image
  //lightDim =?;
  

  setBackground(Color.black);

  on = 1;
  imageLabel = new JLabel(lightOff);
  add(imageLabel);
}
	
//-----------------------------------------------------------------
//  Paints the panel using the appropriate image.
//-----------------------------------------------------------------
public void paintComponent(Graphics page)
{
   super.paintComponent(page);

   if (on==1) {
      imageLabel.setIcon(lightOn);
   }
   else if (on==2) {
      imageLabel.setIcon(lightOff);
   }else {
	   // fill this in! 
	   imageLabel.setIcon(lightOff);
   }
}

//-----------------------------------------------------------------
//  Sets the status of the light bulb.
//-----------------------------------------------------------------
public void setOn(int lightBulbOn)
{
   on = lightBulbOn;
}
}	

//********************************************************************
//LightBulbControls.java       Java Foundations
//
//Represents the control panel for the LightBulb program.
//********************************************************************


class LightBulbControls extends JPanel
{
private LightBulbPanel bulb;
private JButton onButton, offButton, dimButton;

//-----------------------------------------------------------------
//  Sets up the lightbulb control panel.
//-----------------------------------------------------------------
public LightBulbControls(LightBulbPanel bulbPanel)
{
  bulb = bulbPanel;
  onButton = new JButton("On");
  onButton.setEnabled(false);
  onButton.setMnemonic('n');
  onButton.setToolTipText("Turn it on!");
  onButton.addActionListener(new OnListener());
  offButton = new JButton("Off");
  offButton.setEnabled(true);
  offButton.setMnemonic('f');
  offButton.setToolTipText("Turn it off!");
  offButton.addActionListener(new OffListener());
  // define a new button and set stuff
  //dimButton = ?;
  //dimButton.setEnabled?;
  //dimButton.setMnemonic(?);
  //dimButton.setToolTipText(?);
   //dimButton.addActionListener(new DimListener());
  setBackground(Color.black);
  add(onButton);
  add(offButton);
  //add dimButton!;
}

//*****************************************************************
//  Represents the listener for the On button.
//*****************************************************************
private class OnListener implements ActionListener
{
  //--------------------------------------------------------------
  //  Turns the bulb on and repaints the bulb panel.
  //--------------------------------------------------------------
  public void actionPerformed(ActionEvent event)
  {
     bulb.setOn(1);
     onButton.setEnabled(false);
     offButton.setEnabled(true);
     //enable dimButton here
     bulb.repaint();
  }
}		
//*****************************************************************
//  Represents the listener for the Off button.
//*****************************************************************
private class OffListener implements ActionListener
{
   //--------------------------------------------------------------
   //  Turns the bulb off and repaints the bulb panel.
   //--------------------------------------------------------------
   public void actionPerformed(ActionEvent event)
   {
      bulb.setOn(2);
      onButton.setEnabled(true);
      offButton.setEnabled(false);
    //enable dimButton here
      bulb.repaint();
   }
}
//*****************************************************************
//Represents the listener for the dim button.
//*****************************************************************
private class DimListener implements ActionListener
{
//--------------------------------------------------------------
//  Turns the bulb off and repaints the bulb panel.
//--------------------------------------------------------------
public void actionPerformed(ActionEvent event)
{
  bulb.setOn(3);
  //enable onButton and offButton 
  //
  //disable dimButton;
  bulb.repaint();
}
}
}		
