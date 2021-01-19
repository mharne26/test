package output;

import classes.Item;
import java.io.*;


public class Result {
	
	public static void displayResult(Item i)
	{
		String str = String.format("%-10s%-15.3f%-20.3f%-25.4f%-7d%-20.4f", i.getName(),i.getPrice(),i.getStl(),i.getFppi(),i.getQty(),i.getTotal_Price());
		System.out.println(str);
		
	
	
	}

	public static void displayResultFormat() {
		System.out.println("\n\n\nOutput:");
		String str = String.format("%-10s%-15s%-20s%-25s%-7s%-20s", "Name","Price","tax liability","Final Price per Item","Qty","Total Price");
		System.out.println(str);
		
	}


	

}
