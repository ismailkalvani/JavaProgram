class Pattern6
{
	//pyramid
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());
		
		for(int i=1;i<=n;i++)
		{
			for(int s=n-1;s>=i;s--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}