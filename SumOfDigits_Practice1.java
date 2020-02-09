import java.util.Scanner;

public class SumOfDigits_Practice1
{
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   int input = scan.nextInt();
   int sum = 0;
   while (input > 0)
   {
      int add = input % 10;
      sum = sum + add;
      input = input / 10;
   }
   System.out.println(sum);
   }
}