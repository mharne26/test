package classes;

import classes.Constant;

public class Manufactured extends Item {

	public Manufactured(String name, String type, Double price, int quantity) {
		super(name, type, price, quantity);
	}
	public void calc_stl() 
	{
		stl = Constant.TAX_RATE_MANUFACTURED* price + (1+Constant.TAX_RATE_MANUFACTURED) * price * Constant.SURCHRGE_RATE_MANUFACTURED; 
		fppi = price + stl ;
	}

}
