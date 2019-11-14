package lab4;
import java.util.Scanner;

import lab4.VendingMachine;
public class Canadian_VendingMachine {
	// This class is an extension of VendingMachines  in Canada, in a US embassy.  

	// Q5: Now, the original Vending Machine was made in US and all the currency was set to USD. 
	// But in Canada, we need to convert USD to CAD. 
	// %(a)One USD = 1.31 CAD, with conversion rate. write a getter and setter for it
	private double conv; 
	public double getConv(){
		// code here
	}
	public void setConv(double rate){
		// code here 
	}
	
	// Here is what should happen: 
	//1. Price is displayed in USD and CAD both 
	//2. Customer gets a choice which currency to pay in 
	//3. Customer gets the change money in the currency he chose for 
	//4. The vending machine should always store the money in USD  
	// For this to happen, first ask customer which CurrencyIn they would like to pay. 
	// 5(c) Hence, override the currencyIn method 
	public String currencyIn(){
		//5(b)) this requires some getters! Write them first! 
		// correct the following line
		System.out.println("The price of a "+type+" is "+price+" USD");
		System.out.println("which is "+getConv+ "CAD");
		System.out.println("How would you like to pay? USD or CAD? Please enter your response");
		String curr = "USD";
		// ask user for the response using scanner 
		// Store it in curr
		return curr;
	}
	
	// Now, you will have to override the pay() method from parent 
	public double pay() {
		String curr = this.currencyIn();
		// 5(d)getMoneyFromCustomer() is a super class method. So edit the following line to call that
		double customerMoney = ?.getMoneyFromCustomer();
		// get the price per bottle in the given country's currency. 
		// 5(e) edit the following line with getPrice, and exchange rate, and call exchangePrice from parent
		double unitprice = ?.exchangePrice(curr, ?, this.conv);
		// 5(f) getChangeis a super class method. So edit the following line to call that
		double change = ?.getChange(unitprice, customerMoney);
		// if customer added insufficient money, the change would be the amount customer paid to, and in that case we don't want to wend anything
		if (change - customerMoney != 0.0){
			// yes, customer did give sufficient money
			//5(g)the price here should be in USD
			?.addVendingMachineMoney(?.price);
			return change;
		}
		return -1;
	}
	}
