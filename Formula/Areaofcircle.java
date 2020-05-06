public class Areaofcircle
{
	public static double areaCircle(double radius)
	{
		double area = Math.PI * radius * radius;
		return area;
	}
	public static void main(String args[])
	{
		System.out.print("Enter Radius : ");
		double r = Integer.parseInt(System.console().readLine());
		
		System.out.println(" Area of Circle is : "+areaCircle(r));
	}
}
