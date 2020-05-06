package mystacklist;
import linklist.Mylinklist;
public class Mylinkstack
{
	Mylinklist ll = new Mylinklist();
	public int push(int data)throws Exception
	{
		return ll.add(data);
		
	}
	public int pop()throws Exception
	{
		return ll.removeLast();
		
	}
	public void peek()throws Exception
	{
		ll.print();
	}
	public void bsort()
	{
		ll.sort();
	}
	public int search(int s)
	{
		return ll.search(s);
	}
}