import java.io.*;

class PalindromStr
{
	public static void main(String arg[])throws Exception
	{
		String o,r ="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String or Number  : ");
		o = br.readLine();
		
		for(int i=o.length()-1;i>=0;i--)
		{
			r = r + o.charAt(i);
		}
		if(o.equals(r))
			System.out.println(r+" Is Palindrom");
		else
			System.out.println(r+" Is Not Palindrom");
	}
}