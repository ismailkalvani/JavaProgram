class Pattern8
{/*	12345
	22222
	12345
	44444
	12345   */
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i%2==0)
					System.out.print(i+" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}