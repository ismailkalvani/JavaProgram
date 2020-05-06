import java.util.Scanner;

// Amstrong is number that is equal to the sum of cubes of its digits
//0,1,153,370,371 etc are amstrong number 
//for Ex: 153 = (1*1*1)+(5*5*5)+(3*3*3)
//			= 1  +  125 + 27     =  153
			
public class Amstrong
{
	public static boolean isAmstrong(int n)
	{
		int r,sum=0,temp = n;
		while (temp !=0)
		{
			r = temp % 10;
			System.out.println("r "+r);
			sum = sum + r * r *r ;
			System.out.println("sum "+sum);
			temp /= 10;
			System.out.println("temp "+temp);
		}
		if(n == sum)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numbe to check Amstrong : ");
		int no = sc.nextInt();
		
		System.out.println(no+" is Amstrong ? : "+isAmstrong(no));
	}
}
