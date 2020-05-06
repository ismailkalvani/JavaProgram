import java.io.*;
class Fibonascci
{
	public static void main(String arg[])throws Exception
	{
		System.out.print("Enter Number of Fibonascci Term :  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<=n ;i++)
		{
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
	
}