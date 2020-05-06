class Quicksort
{
	public static void main(String args[])
	{
		Myquicksort qs = new Myquicksort();
		int a[] = new int[10];
		for(int i=0;i<=9;i++)
		{
			System.out.print("Enter Number : ");
			a[i] = Integer.parseInt(System.console().readLine());
		}
		qs.qsort(a,0,9);
		for(int i=0;i<=9;i++)
		{
			System.out.println("Number : "+a[i]);
		}	
	}
}
class Myquicksort
{
	void qsort(int a[],int f,int l)
	{
		int mid = a[(f+l)/2];
		int front = f;
		int rear = l;
		
		while(front <= rear)
		{
			while(a[front] < mid )
			{
				front++;
			}
			while(a[rear] > mid )
			{
				rear--;
			}
			if(front<= rear)
			{
				int temp = a[front];
				a[front] = a[rear];
				a[rear] = temp;
				
				front ++;
				rear--;
			}
			if(f < rear)
			{
				qsort(a,f,rear);
			}
			if(front < l)
			{
				qsort(a,front,l);
			}
			return;
		}
	}
}