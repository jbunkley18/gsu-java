//********************************************************************
//  CoordinatesPanel
//
//  Represents the primary panel for the Coordinates program.
//********************************************************************

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
class CoordinatesPanel extends JPanel
{
   private final int SIZE = 20;  // diameter of dot

   private int x = 50, y = 50;  // coordinates of mouse press

   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public CoordinatesPanel()
   {
      addMouseListener(new CoordinatesListener());

      setBackground(Color.black);
      setPreferredSize(new Dimension(500, 500));
   }		
 //-----------------------------------------------------------------
   //  Draws all of the dots stored in the list.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);

      page.setColor(Color.white);

      page.fillRect(x,y,SIZE, SIZE);
      Font newFont = new Font("Helvetica", Font.PLAIN, 24);
      page.setFont(newFont);

      page.drawString("Coordinates: (" + x + ", " + y + ")", 10, 30);
   }

   //*****************************************************************
   //  Represents the listener for mouse events.
   //*****************************************************************
   private class CoordinatesListener implements MouseListener
   {
      //--------------------------------------------------------------
      //  Adds the current point to the list of points and redraws
      //  the panel whenever the mouse button is pressed.
      //--------------------------------------------------------------
      public void mousePressed(MouseEvent event)
      {
         x = event.getX();
         y = event.getY();
         repaint();
      }		
    //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
     public void mouseClicked(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
   }
}		

//********************************************************************
//  Coordinates
//
//  Demonstrates mouse events.
//********************************************************************

public class Coordinates {
	//-----------------------------------------------------------------
	   //  Creates and displays the application frame.
	   //-----------------------------------------------------------------
	   public static void main(String[] args)
	   {

         JFrame frame = new JFrame("Coordinates");

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame.getContentPane().add(new CoordinatesPanel());
         
         frame.pack();
	      frame.setVisible(true);
	   }


}
