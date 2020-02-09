import java.util.Scanner;

public class ComputeAreas
{
	
public static double squareArea(double side)
{
	double squareArea = Math.pow(side, 2);
	return squareArea;
}
public static double rectangleArea(double width, double length)
{
	double rectangleArea = (width*length);
	return rectangleArea;
}
public static double circleArea(double radius)
{
	double circleArea = (Math.PI*Math.pow(radius, 2));
	return circleArea;
}
public static double triangleArea(double base, double height)
{
	double beforeDividing = (base*height);
	double triangleArea = beforeDividing*0.5;
	return triangleArea;
}

public static void main(String[] args)
{
	double side, width, length, radius, base, height;

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter side");
	side = scan.nextDouble();
	System.out.println("Enter width");
	width = scan.nextDouble();
	System.out.println("Enter length");
	length = scan.nextDouble();
	System.out.println("enter radius");
	radius = scan.nextDouble();
	System.out.println("Enter base");
	base = scan.nextDouble();
	System.out.println("Enter height");
	height = scan.nextDouble();
	
	System.out.println("Square side = " + side);
	System.out.println("Square area = " + squareArea(side));

	System.out.println("Rectangle Width = " + width);
	System.out.println("Recangle Length = " + length);
	System.out.println("Rectangle Area = " + rectangleArea(width, length));
	
	System.out.println("Circle Radius = " + radius);
	System.out.println("Circle Raidus = " + circleArea(radius));
	
	System.out.println("Triangle Base = " + base);
	System.out.println("Triangle Height = " + height);
	System.out.println("Triangle Area = " + triangleArea(base, height));
}
}