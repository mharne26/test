package main;
/* Assignment 1: Write a standalone java program that accepts items details and calculate the effective cost  after applying the tax rules.
 * @author: Mayur Harne
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import input.InputAccept;
import classes.*;
import output.Result;
import classes.Item;



public class FirstClass {

	public static void main(String[] args) throws IOException {
		ArrayList<Item> list = new ArrayList<Item>();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)) ; //to read input from keyboard (inputstreamreader)
		char ch ;
		Item i ;
//		Double effectivePriceOfAllItems= 0.0 ;
		Double totalPrice ;
		do
		{
			i = InputAccept.enterInput() ;
			i.calc_stl() ;
			totalPrice = i.getQty()*i.getFppi() ;
			i.setTotal_Price(totalPrice);
//			effectivePriceOfAllItems+=i.getTotal_Price() ;
			list.add(i);
			System.out.print("Do you want to enter another item details(Enter y/n) : ");
			ch = obj.readLine().charAt(0) ;
		}while((ch=='y')||(ch=='Y'));
		
		
		Result.displayResultFormat();
		for (Item item : list) {
			Result.displayResult(item);
		}
		
	}

}
