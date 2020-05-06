import java.io.*;
class Palindromprimes
{
	public static void main(String arg[])throws Exception
	{
		System.out.print("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count;
		
		if(isPalindrom(n) && isPrime(n))
			System.out.println(n+" Is PalPrime Number ");
		else
			System.out.println(n+" Is Not PalinPrime Number ");
	}
	public static boolean isPrime(int no)
	{
		if(no == 1 || no == 2) return true;
		for(int i=2; i*i<=no; i++)
		{
			if( no%i == 0)
				return false;
		}
		return true;
	}
	public static boolean isPalindrom(int n)
	{
		int sum =0,r,temp;
		temp = n;
		while(n>0)
		{
			r = n%10;//getting Remainder
			sum = (sum*10)+r;
			n = n/10;
		}
		if(temp == sum) return true;
		else return false;
	}
}