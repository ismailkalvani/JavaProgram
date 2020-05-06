public class Areaofsqure
{
	public static double areaSqure(double side)
	{
		double area = side * side;
		return area;
	}
	public static void main(String args[])
	{
		System.out.print(" Enter Side of Squre : ");
		double s = Integer.parseInt(System.console().readLine());
		
		System.out.println(" Area of Rectangle is : "+areaSqure(s));
	}
}
