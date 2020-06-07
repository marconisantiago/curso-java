package Util;

public class CurrentConverter {
	
	public static double dollarPrice = 3.10;
	public static double iof = 0.06;
	
	public static double amountBePaid (double quantyDollar) {
		double grossQuanty = quantyDollar*dollarPrice;
		double tax = iof* grossQuanty;
		return grossQuanty  + tax;
	}
	
	
	

}
