package input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import classes.Item;
import input.InputValid;
import classes.Constant;
import classes.Imported;
import main.FirstClass;
import classes.*;


public class InputAccept {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	public static Item enterInput() throws IOException
	{

		String name ;
		String str ;
		String type ;
		Double price ;
		int qty ;
		boolean valid ;
		

		System.out.println("\nEnter the Item Details :");
		System.out.print("Enter the Item name : ");
		name = br.readLine();

		System.out.print("Enter the Item price : ");
		do{
			str = br.readLine();
			valid  = InputValid.checkDouble(str);
		} while(!valid) ;
		price =  Double.parseDouble(str) ;

		System.out.print("Enter the Item type : ");
		do{
			str = br.readLine();
			valid  = InputValid.checkItemType(str);
		}while(!valid) ;
		type = str.toLowerCase() ;

		System.out.print("Enter the Item Qty : ");
		do{
			str = br.readLine();
			valid  = InputValid.checkInt(str);
		}while(!valid) ;
		qty = Integer.parseInt(str);
		
		Item i ;
		switch(type)
		{
			case Constant.RAW :
				i = new Raw(name,type,price,qty);
				break ;
			case Constant.MANUFACTURED :
				i = new Manufactured(name,type,price,qty);
				break ;
			default :
				i = new Imported(name,type,price,qty);
				break ;
				
		}
		return i ;

	}
}
