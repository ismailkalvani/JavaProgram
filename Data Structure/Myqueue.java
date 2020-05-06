package myqueue;
public class Myqueue
{
	int size = 10,f =-1,r=-1;
	int a[] = new int[size];
	public void push(int no)throws Exception
	{
		if(r== size-1)
		{
			throw new Exception ("Queue is Overflow");
		}
		else
		{
			if(f==-1) f++;
			r++;
			a[r] = no;
		}
	}
	public void pop()throws Exception
	{
		if(f==-1)
		{
			throw new Exception ("Stack is Empty");
		}
		else
		{
			if(f==r) f=r= -1;
			else f++;
		}
	}
	public void peep()throws Exception
	{
		if(f==-1)
		{
			throw new Exception ("Stack is Empty");
		}
		else
		{
			for(int i=f; i<=r ;i++)
				System.out.print("<-"+a[i]);
		}
	}	
}