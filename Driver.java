package lab4;
import java.util.Arrays;

import lab4.VendingMachine;
public class Driver {
	public static void main(String[] args) {
		//////////////////////////////////////////////////
		//Q0: Make sure that you are able to run the driver class and see the Vending Machine in action  
		VendingMachine vm = new VendingMachine(5, 1, "Water");
		// Enter the sufficient change 
		vm.Vend();
		// enter insufficient change 
		vm.Vend();
		// Q1: Make this VM vend Pepsi for you by changing above code 
		//////////////////////////////////////////////////
		//Q6: test out your canadian vending machine by editing the code above! 
		
	}
}
