import java.io.*;
class FibonascciArr
{
	public static void main(String arg[])throws Exception
	{
		System.out.print("Enter Number of Fibonascci Term :  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int a[] = new int [n];
		a[0] = 0;
		a[1] = 1;
		
		System.out.print(a[0]+" "+a[1]+" ");
		for(int i=2; i<n ;i++)
		{
			a[i] = a[i-1] + a[i-2];
			System.out.print(a[i]+" ");
		}
	}
}