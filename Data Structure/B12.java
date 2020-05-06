class B12
{
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());
		boolean flag = true;
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
				flag = false;
		}
		if(flag)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}
}