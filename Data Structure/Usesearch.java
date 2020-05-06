import mysearch.Mysearch;
class Usesearch
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int s;
		for(int i=0; i<=9; i++)
		{
			System.out.print("Enter Number : ");
			a[i] = Integer.parseInt(System.console().readLine()); 
		}
		System.out.println("Enter Searching Element : ");
		s = Integer.parseInt(System.console().readLine()); 
		
		Mysearch se = new Mysearch(a,s);
	}
}