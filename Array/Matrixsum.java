import java.util.*;
class Matrixsum
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Line of Rows : ");
		int rows = sc.nextInt();
		
		System.out.print("Enter Line of Colums : ");
		int col = sc.nextInt();
		
		int a[][] = new int[rows][col];
		int b[][] = new int[rows][col];
		int c[][] = new int[rows][col];
		System.out.println ("Enter Element in Matrix :-");
		
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<col; j++)
			{
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<col; j++)
			{
				b[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<col; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
			System.out.println();
		}
		System.out.println("Total Element of Matrix is :-");
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}