class Sort
{
	public static void main(String args[])
	{
		Bsort b1 = new Bsort();
		int ba[] = new int[10];
		for(int i=0;i<=9;i++)
		{
			System.out.print("Enter Number : ");
			ba[i] =Integer.parseInt(System.console().readLine());
		}
		b1.add(ba);
		
		SSort s1 = new SSort();
		int sa[] = new int[10];
		for(int i=0;i<=9;i++)
		{
			System.out.print("Enter Number : ");
			sa[i] =Integer.parseInt(System.console().readLine());
		}
		s1.add(sa);
	}
	
}
class SSort
{
	void add(int a[])
	{
		for(int i=0;i<=9;i++)
		{
			boolean sorted = true ;
			for(int j=i+1;j<=9;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					sorted = false ;
				}
			}if (sorted) break ;
		}
		for(int i=0;i<=9;i++)
		{
			System.out.println(a[i]);
		}
	}
}
class Bsort
{
	void add(int a[])
	{
		for(int i=0;i<=9;i++)
		{
			boolean sorted = true ;
			for(int j=0;j<=9-1-i;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					sorted = false ;
				}
			}if (sorted) break ;
		}
		for(int i=0;i<=9;i++)
		{
			System.out.println(a[i]);
		}
	}
}