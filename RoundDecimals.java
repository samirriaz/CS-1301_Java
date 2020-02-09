public class RoundDecimals
{
public static void main(String[] args)
{
   double x = 12.1254;
   double xx = (double)Math.round(x*100d)/100d;
   System.out.println(xx);
   //(double)Math.round   
   //                   0.00: (x*100d)/100d)
   //                  0.000: (x*1000d)/1000d)
   //                 0.0000: (x*10000d)/10000d)
   }
}