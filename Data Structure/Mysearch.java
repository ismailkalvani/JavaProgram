package mysearch;
public class Mysearch
{
	public Mysearch(int a[],int s)
	{
		int n = a.length;
		boolean found = false;
		for(int i=0; i<=n-1;i++)
		{
			if(a[i] == s)
			{
				System.out.println("Found "+s+" at "+(i+1));
				found = true;
			}
		}if(!found) System.out.println(" Not Found ");
	}
}