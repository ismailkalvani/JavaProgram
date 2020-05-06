package quicksort;
public 0class Myquicksort
{
	public void qsort(int a[],int f,int l)
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