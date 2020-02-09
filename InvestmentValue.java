import java.util.Scanner;

public class InvestmentValue
{		
	public static void main(String[] args)
	{
		int years = 1;
				
	Scanner scan = new Scanner(System.in);
	System.out.println("Amount Invested: ");
	double investment = scan.nextInt();
	System.out.println("Annual Interest Rate: ");
	double rate = scan.nextInt();
	for (years=1; years<=30; years++)
	{
		System.out.println("Years\tFuture Value\n" + years + "\t" + futureInvestmentValue(investment, rate, years));
	}	
}
	public static double futureInvestmentValue(double investment, double rate, int years)
{
		double money = investment*(rate+1);
		return money;
}
}