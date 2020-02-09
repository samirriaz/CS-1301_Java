import java.util.Scanner;

public class Occurences 
{
public static int count(String x, char a)
{
	int count = 0;
    for (int i=0; i < x.length(); i++)
    {
        if (x.charAt(i) == a)
        {
             count++;
        }
    }
    return count;
}
public static void main (String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String x = scan.nextLine();
	System.out.println("Which letter do you want to test occurences for?");
	char a = scan.nextchar();
	
	System.out.println(a + " occurs in the string " + count(x, a) + " many times.");
}
}
