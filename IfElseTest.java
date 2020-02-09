import java.util.Scanner;

public class IfElseTest
{
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter 1: ");
   int x = scan.nextInt();
   
   if (x == 1){
   System.out.println("Enter 1 again: ");
   int a = scan.nextInt();  
   if (a == 1)
   System.out.println("True");
   if (a != 1)
   System.out.println("False");
   }
   if (x != 1){  
   System.out.println("False");
   }
   }
}
