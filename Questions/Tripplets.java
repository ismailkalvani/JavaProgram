//Que 4 :- Find two sum of sub array is equal to given number  
// it can done using two pointer Algo 

import java.util.*;
class Tripplets
{
	public static boolean twoSum(int a[],int x,int i)
	{
		int j = a.length-1;
		while (i < j)
		{
			if (a[i]+a[j] > x)
				j--;
			else if(a[i]+a[j] < x)
				i++;
			else
				return true;
		}
		return false;
	}
	public static boolean findTriplets(int a[],int n)
	{
		Arrays.sort(a);
		for(int i=0; i<n-2; i++)
		{
			if(twoSum(a, -a[i], i+1)) return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		int arr[] = {-3,-4,1,7,0};
		int arr1[] = {-3,-4,1,-7,9};
		int n = arr.length;
		int n1= arr1.length;
		System.out.println("Total of three Element in Array is Zero  : "+findTriplets(arr,n));
		System.out.println("Total of three Element in Array is Zero  : "+findTriplets(arr1,n1));
	}
	
}