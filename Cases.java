import java.util.Scanner;

public class Cases
{
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a numeric grade (0-100): ");
   int grade = scan.nextInt();
   
   category = grade/10;
   System.out.println("That grade is ");
   switch(category){
   case 10:
      System.out.println("a perfect score. Well done.");
      break;
   case 9:
      System.out.println("well above average. Good job.");
      break;
   case 8:
      System.out.println("Good work.")
   case