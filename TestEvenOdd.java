import java.util.Scanner;

public class TestEvenOdd
{
public static void main(String[] args)
{  
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter an integer between 0 and 999: ");
   int input = scan.nextInt();

   int x = input % 2;
   if (input < 0)
   System.out.println("Integer is negative. Press Command-R and try again. ");
else
   if (input == 0)
   System.out.println("Integer is 0.");
else
   if (input > 999)
   System.out.println("Integer is greater than 999. Press Command-R and try again.");
else
   if (x == 1)
   System.out.println("Integer is odd.");
else
   if (x == 0)
   System.out.println("Integer is even.");
   }
}