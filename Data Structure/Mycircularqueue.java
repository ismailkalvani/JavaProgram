package mycircularqueue;
public class Mycircularqueue
{
	int size = 10,f =-1,r=-1;
	int a[] = new int[size];
	public void push(int no)
	{
		if(r== size-1)
			r=0;
		else if(f==-1)
		{
			f++;
			r++;
		}
		else 
			r++;
		a[r] = no;
	}
	public void pop()throws Exception
	{
		if(f==-1)
		{
			throw new Exception ("Queue is Empty");
		}
		else if(f==r)
			f=r= -1;
		else if (f== size-1)
			f=0;
		else
			f++;
	}
	public void peep()throws Exception
	{
		if(f==-1)
		{
			throw new Exception ("Queue is Empty");
		}
		else if(f<=r)
		{
			for(int i=f; i<=r ;i++)
				System.out.print("<-"+a[i]);
		}
		else 
		{
			for(int i=f; i<=size-1 ;i++)
				System.out.print("<-"+a[i]);
		
			for(int i=0; i<=r ;i++)
				System.out.print("<-"+a[i]);
		}
	}	
}