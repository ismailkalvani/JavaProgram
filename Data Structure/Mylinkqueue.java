package myqueuelist;
import linklist.Mylinklist;
public class Mylinkqueue
{
	Mylinklist ll = new Mylinklist();
	public int enqueue(int data)throws Exception
	{
		return ll.add(data);
		
	}
	public int dequeue()throws Exception
	{
		return ll.removeFirst();
		
	}
	public void displayqueue()throws Exception
	{
		ll.print();
	}
	
}