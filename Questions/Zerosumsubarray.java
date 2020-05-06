// Que 6 :- Find sum of sub array is equal to Zero  
// it can done using Set 
import java.util.*;
class Zerosumsubarray
{
	public static void main(String args[])
	{
		int []a = {2,1,3,-4,-2};
		int k = 5;
		boolean found = false;
		// for(int i=0; i<a.length; i++)
		// {
			// int sum = 0;
			// for(int j=0; j<a.length;j++)
			// {
				// sum += a[j];
				// if(sum == 0)
				// {
					// found = true;
					// break;
				// }
			// }
			// if(found) break;
		// }
		Set set = new HashSet();
		int sum =0;
		for (int element : a)
		{
			set.add(sum);
			sum += element;
			if(set.contains(sum-k));
			{
				found =true;
				break;
			}
		}
		System.out.println("Found : "+found);	
	}
}