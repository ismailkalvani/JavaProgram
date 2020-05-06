class Pattern3
{
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}