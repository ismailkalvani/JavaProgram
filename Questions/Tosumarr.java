//Que 4 :- Find two sum of sub array is equal to given number  
// it can done using two pointer Algo 
class Tosumarr
{
	public static boolean twoSum(int a[],int n)
	{
		int i = 0, j = a.length-1;
		while (i < j)
		{
			if (a[i]+a[j] > n)
				j--;
			else if(a[i]+a[j] < n)
				i++;
			else
				return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		int arr[] = {-4,3,-5,1,5,4};
		System.out.println("Total of two sum 9 is :"+twoSum(arr,1));
	}
	
}