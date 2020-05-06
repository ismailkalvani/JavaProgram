import java.io.*;
class Palindrom
{
	public static void main(String arg[])throws Exception
	{
		int sum =0,r,temp;
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		temp = n;
		while(n>0)
		{
			r = n%10;//getting Remainder
			sum = (sum*10)+r;
			n = n/10;

		}
		if(temp == sum)
			System.out.println(sum+" Is Palindrom");
		else
			System.out.println(sum+" Is Not Palindrom");
	}
}