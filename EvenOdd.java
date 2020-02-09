import java.util.ArrayList;

public class EvenOdd
{
public static void main(String[] args)
{
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<Integer> number = new ArrayList<Integer>();

	int y, x = 50;
	for (x=50; x<=100; x+=2)
	{
		numbers.add(x);		
	}
	System.out.println("Even numbers between 50 and 100: " + numbers);
	
	for (x=51; x<100; x+=2)
	{
		number.add(x);
	}
	System.out.println("\n");
	System.out.println("Odd numbers between 50 and 100: " + number);
	}
}