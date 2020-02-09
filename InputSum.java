import java.util.ArrayList;
import java.util.Scanner;

public class InputSum
{
public static void main(String[] args)
{
    ArrayList<Integer> numbers = new ArrayList<Integer>();

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a positive integer.");
	int x = scan.nextInt();
	int sum = 0;
	
	while (x>=0)
	{
		numbers.add(x);
		sum = sum + x;
		x = scan.nextInt();
	}
	System.out.println("Entered Number: " + numbers);
	System.out.println("The Sum: " + sum);
}
}