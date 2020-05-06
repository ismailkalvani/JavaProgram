package mysort;
public class Mysort
{
	public Mysort(int a[])
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			boolean sorted = true ;
			for(int j=i+1;j<n;j++)
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
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}