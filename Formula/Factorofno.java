class Factorofno
{
	public static void main(String args[])
	{
		System.out.print(" Enter Number for Factors : ");
		int n = Integer.parseInt(System.console().readLine());
		System.out.println(n+" Factors is  : ");
		factors(n);
	}
	public static void factors(int no)
	{
		for(int i=1; i<=no/2; i++)
		{
			if(no % i == 0)
			{
				System.out.println(i+" ");
			}
		}
	}	
}