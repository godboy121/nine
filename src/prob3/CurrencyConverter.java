package prob3;

public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won)
	{
		double result=won/rate;
		return result;
		
		
	}
	public static double toKRW(double dollor)
	{
		double result=dollor*rate;
		return result;
		
	}
	public static void setRate(double r)
	{
		rate=r;
	}
	
}

		

	



	

