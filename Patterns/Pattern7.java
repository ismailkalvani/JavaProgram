class Pattern7
{
	//Dimond
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());
		for(int i=1;i<=n;i++)
		{
			for(int s=n-1;s>=i;s--)
				System.out.print("  ");
			
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			
			for(int k=2;k<=i;k++)
				System.out.print("* ");			
			
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int s=1;s<=i-1;s++)
				System.out.print("  ");
			
			for(int j=n;j>=i;j--)
				System.out.print("* ");
			
			for(int j=n-1;j>=i;j--)
				System.out.print("* ");

			System.out.println();
		}
	}
}