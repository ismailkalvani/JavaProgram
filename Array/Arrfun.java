import java.util.*;
class Arrfun
{
	public static void main(String args[])
	{
		char a[] = {'A','R','R','A','Y','1'};
		char b[] = new char [5];
		System.out.println("Copy From Array	 :");
		System.arraycopy(a,0,b,0,5);
		System.out.println(new String(b));
		
		System.out.println("Copy From Range Array :");
		char c[] = Arrays.copyOfRange(a,3,6);
		System.out.println(new String(c));
		
		System.out.println("Sorted Array Is :");
		Arrays.sort(a);
		for(int i=0; i<=b.length; i++)
			System.out.print(a[i]);
	}
}