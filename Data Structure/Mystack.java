package mystack;
public class Mystack
{
	int size = 10,tos =-1;
	int a[] = new int[size];
	public void push(int no)throws Exception
	{
		if(tos== size-1)
		{
			throw new Exception ("Stack is Overflow");
		}
		else
		{
			tos++;
			a[tos] = no;
		}
	}
	public void pop()throws Exception
	{
		if(tos==-1)
		{
			throw new Exception ("Stack is Empty");
		}
		else
			tos--;
	}
	public void peep()throws Exception
	{
		if(tos==-1)
		{
			throw new Exception ("Stack is Empty");
		}
		else
		{
			for(int i=tos; i>=0 ;i--)
				System.out.print(a[i]+"->");
		}
	}	
}