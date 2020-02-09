import java.util.Scanner;

public class AgeCompare
{
public static void main(String[] args)
{
   System.out.println("Enter your age: ");
   Scanner scan = new Scanner(System.in);
   int age = scan.nextInt();
   
   System.out.println("Enter what age you want to be: ");
   Scanner scan1 = new Scanner(System.in);
   int cap = scan1.nextInt();
   
   if (cap-age < 0)
   System.out.println("You are older than you want to be? Reality sucks, huh?");
   else
   System.out.println("You will be " + cap + " in " + (cap-age) + " years.");
   }
}