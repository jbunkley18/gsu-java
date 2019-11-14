
//********************************************************************
//  EvenOdd
//
//  Demonstrates the use of the JOptionPane class.
//********************************************************************

import javax.swing.JOptionPane;

public class EvenOdd {
	//-----------------------------------------------------------------
	   //  Determines if the value input by the user is even or odd.
	   //  Uses multiple dialog boxes for user interaction.
	   //-----------------------------------------------------------------
	   public static void main(String[] args)
	   {
	      String numStr, numStr2, result;
	      int num, num2, again;

	      do 
	      {
	         numStr = JOptionPane.showInputDialog("Enter an integer: ");

				num = Integer.parseInt(numStr);
				
				numStr2 = JOptionPane.showInputDialog("Enter another integer: ");

	         num2 = Integer.parseInt(numStr2);

				int sum = num + num2;

	         result = "The sum of these two numbers is " + sum;
	         JOptionPane.showMessageDialog(null, result);

	         again = JOptionPane.showConfirmDialog(null, "Do Another?");
	      }
	      while (again == JOptionPane.YES_OPTION);
	   }
	}		



