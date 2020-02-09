import java.util.Scanner;

public class SquareRoots
{
public static void main (String[] args)
{
   Scanner scan = new Scanner(System.in);
   double x = scan.nextDouble();
   double cr = Math.pow(x, 0.5);
   System.out.print(cr);
   }
}