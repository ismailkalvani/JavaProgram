package mydequeue;
public class Mydequeue
{
	int size = 10,f =-1,r=-1;
	int a[] = new int[size];
	public void insertfront(int no)throws Exception
	{
		if(f==size-1)
			throw new Exception(" Not Enough Space");
		else 
		{
			if(f==-1)
			{
				f=0;
				r=0;
			}
			else
				f++;
			
		}
		a[r] = no;
	}
	public void insertrear(int no)throws Exception
	{
		if(r==size-1)
			throw new Exception(" Not Enough Space");
		else 
		{
			if(f==-1)
				f++;
			r++;
		}
		a[r] = no;
	}
	public void deletefront()throws Exception
	{
		if(f==-1)
		{
			throw new Exception ("Queue is Empty");
		}
		else 
		{
			if(f==r)
				f=r= -1;
			else 
				f++;
		}
	}
	public void deleterear()throws Exception
	{
		if(f==-1)
		{
			throw new Exception ("Queue is Empty");
		}
		else 
		{
			if(f==r)
				f=r= -1;
			else 
				r--;
		}
	}
	public void display()throws Exception
	{
		if(f==-1)
		{
			throw new Exception ("Queue is Empty");
		}
		else 
		{
			for(int i=f; i<=r ;i++)
				System.out.print("<-"+a[i]);
		}
	}	
}