import java.util.Scanner;

public class PrintF
{
public static void main(String[] args)
{
   int d = 1;
   double f = 1.266;
          f = (double)Math.round(f*100d)/100d;

   String s = "This message is long and lengthy, but I can easily recall it with printf :)";
   
   System.out.printf("%d \n%f \n%s",d,f,s);
   }
}