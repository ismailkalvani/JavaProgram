class Pattern5
{
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());
		
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i-1;s++)
			{
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}