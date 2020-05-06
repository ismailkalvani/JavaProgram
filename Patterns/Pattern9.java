class Pattern9
{/*	11315
	12325
	13335
	14345
	15355   */
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j%2==0)
					System.out.print(i+" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}