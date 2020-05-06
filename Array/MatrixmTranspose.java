 import java.util.*;
class MatrixmTranspose
{
	public static void main(String []args)
	{
		int b[][] = {{10,20,30},{40,50,60}};
		transpose(b);
	}
	static int [][] transpose(int b[][])
	{
		int a[][] = new int[b.length][b.length];
		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<b.length; j++)
				a[i][j] = b[j][i];
		}
		System.out.println("Original Matrix");
		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<b.length; j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("Transposed Matrix");
		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<b.length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		return a;
	}
}