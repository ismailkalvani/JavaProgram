public class Areaofrectangle
{
	public static double areaRect(double height,double width)
	{
		double area = height * width;
		return area;
	}
	public static void main(String args[])
	{
		System.out.print(" Enter Height of Rectangle : ");
		double h = Integer.parseInt(System.console().readLine());
		System.out.print(" Enter Width of Rectangle : ");
		double w = Integer.parseInt(System.console().readLine());
		
		System.out.println(" Area of Rectangle is : "+areaRect(h,w));
	}
}
