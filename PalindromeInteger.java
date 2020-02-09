import java.util.Scanner;

public class PalindromeInteger
{
public static int reverse(int x)
{
	int rev = 0;
	while (x != 0)
	{
	    rev = rev * 10 + x % 10;
	    x = x / 10;  
	}
	return rev;
}
public static String isPalindrome(int x)
{
	String a;
	int hundreds = (x % 10);
	int tens = ((x/10) % 10);
	int ones = (x/100);
	if (ones == hundreds)
	{
		a = ("True");
	}
	else
	{
		a = ("False");
	}
	return a;
}
public static void main (String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int x = scan.nextInt();
	
	System.out.println("You entered: " + x);
	System.out.println("Reversal = " + reverse(x));
	System.out.println("Is it a palindrome? " + isPalindrome(x));
}
}