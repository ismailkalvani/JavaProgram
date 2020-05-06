import quicksort.Myquicksort;
class Usequicksort
{
	public static void main(String args[])
	{
		Myquicksort qs = new Myquicksort();
		int a[] = new int[10];
		for(int i=0;i<=9;i++)
		{
			System.out.print("Enter Number : ");
			a[i] = Integer.parseInt(System.console().readLine());
		}
		qs.qsort(a,0,9);
		for(int i=0;i<=9;i++)
		{
			System.out.println("Number : "+a[i]);
		}	
	}
}