import mysort.Mysort;
class Usesort
{
	public static void main(String args[])
	{
		int sa[] = new int[5];
		for(int i=0;i<=4;i++)
		{
			System.out.print("Enter Number : ");
			sa[i] =Integer.parseInt(System.console().readLine());
		}
		Mysort s1 = new Mysort(sa);
	}
}
		
