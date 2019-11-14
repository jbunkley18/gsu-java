package Lab04;

////////////////////////////////////
//Write a class that extends the Vending Machine class to a vending machine that only vends Pepsi
public class pepsi_VendingMachine extends VendingMachine {
	// Q:1 how would tweak the parent's constructor so that it can only vend pepsi? fill it in below 
	private String product;
	
	public pepsi_VendingMachine( , )
	{
		
	}
	//Q2: write the getters and setters using the parent class' getters and setters. 
	// Hint: use "super" key word to get the parent class' constructors 
	// Hint: In eclipse, type "get" and then press ctr+tab ;)
	// see if that works for "set" :P 
	
	// Q3:Complete the following class method to print how many bottles this vending machine would have 
	public int count_bottles(){
		int count = 0;
		// write your code here
		// hint: look at status method 
		return count;
	}
	// Q4: Write a method to clear all the VendingMachine money at the end of the day. 
	
}
