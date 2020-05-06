import Mybsearch.Bisearch;
class Usebsearch
{
	public static void main(String args[])
	{
		int a[]= new  int[10];
		Bisearch bs = new Bisearch();
		
		for(int i=0;i<=9;i++)
		{
			System.out.print("Enter Number : ");
			a[i] = Integer.parseInt(System.console().readLine());
		}
		System.out.print("Enter Searching Element : ");
		int s = Integer.parseInt(System.console().readLine());
		
		bs.bsearch(a,s);
	}
}