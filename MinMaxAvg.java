import java.util.Scanner;

public class MinMaxAvg 
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	int x, y, z;
	x = scan.nextInt();
	y = scan.nextInt();
	z = scan.nextInt();
	
	System.out.printf("You entered %d %d %d \n",x,y,z);
	System.out.println("Max value: " + Max(x, y, z));
	System.out.println("Min value: " + Min(x, y, z));
	System.out.println("Average value: " + Avg(x, y, z));

}

	public static int Max(int x, int y, int z)
	{
		if (x>y && x>z)
		{
			return x;
		}
		else
		if (y>x && y>z)
		{
			return y;
		}
		else
		{
			return z;
		}
	}
	public static int Min(int x, int y, int z)
	{
		if (x<y && x<z)
		{
			return x;
		}
		else
		if (y<x && y<z)
		{
			return y;
		}
		else
		{
			return z;
		}
	}
	public static int Avg(int x, int y, int z)
	{
		int a = (x+y+z);
		int b = (a/3);
		return b;
	}
}