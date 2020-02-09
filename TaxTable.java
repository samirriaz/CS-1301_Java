import java.util.Scanner;

public class TaxTable
{
public static void main(String[] args)
{	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Status:\n(0-Single, 1-Married Joint or Qualifying Widow(er), 2-Married Separate, 3-Head of House");
	double status = scan.nextInt();
	System.out.println("Enter Taxable Income: ");
	double taxableIncome = scan.nextInt();
	
	System.out.println("Tax = " + computeTax(status, taxableIncome));
}
public static double computeTax(double status, double taxableIncome)
{
	double tax = 0;
	if (status == 0)
	{
		tax = taxableIncome * 0.17376;
	}
	else if (status == 1)
	{
		tax = taxableIncome * 0.1333;
	}
	else if (status == 2)
	{
		tax = taxableIncome * 0.17376;
	}
	else if (status == 3)
	{
		tax = taxableIncome * 0.14706;
	}
	return tax;
} 
}