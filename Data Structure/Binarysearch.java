package Mybsearch;
class Binarysearch
{
	void Bsearch(int a[],int s)
	{
		boolean isFound = false;
		int f=0,l=0,mid;
		
		for(int i=0;i<=9;i++)
		{
			if(f<=l)
			{
				mid = (f+l)/2;
				if(s < a[mid])
					l = mid-1;
				
				elseif(s>a[mid])
					f= mid+1;
					
				else
				{
					isFound = true;
					break;
				}
			}
			else
				break;
		}
		if(isFound)
			System.out.println("Element Found ");
		else
			System.out.println("Element Not Found ");
	}
}