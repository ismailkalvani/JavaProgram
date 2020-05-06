 import java.util.*;
class Matrixmethod
{
	public static void main(String []args)
	{
		int a[][] = {{1,2},{4,5}};
		int b[][] = {{1,2},{4,5}};
		Metmulti(a,b);
	}
	static int [][] Metmulti (int a[][],int b[][])
	{
		int rows = a.length;
		int col = b[0].length;
		int c[][] = new int[rows][col];
		
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<col; j++)
				c[i][j] = a[i][j] * b[i][j];
		}
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<col; j++)
				System.out.print(c[i][j]+" ");
			
			System.out.println();
		}
		return c;
	}
}