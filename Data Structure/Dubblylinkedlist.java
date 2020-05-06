package dubblylist;
public class Dubblylinkedlist
{
	public static class Node
	{
		int data;
		Node next;
		Node pre;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
			this.pre = null;
		}
	}
	public boolean isEmpty()
	{		
		return head == null;
	}
	public Node head;
	public int add(int data)
	{
		Node toAdd = new Node(data);
		//if First Element to add
		if(isEmpty())
		{
			head = toAdd;
			return toAdd.data;
		}
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;

		temp.next = toAdd;
		temp.next.next = null;
		temp.next.pre = temp;
		return toAdd.data;
	}
	public int addBeg(int data)
	{
		Node toAdd = new Node(data);
		toAdd.next = head;
		head.pre = toAdd;
		head = toAdd;
		return toAdd.data;
	}
	public int addBet(int data,int pos) throws Exception
	{
		if(isEmpty())
			throw new Exception("Add Between list is not allowewd in Empty list");

		Node temp;
		temp = head;
		for(int i=1; i<pos-1 ; i++)
		{
			temp = temp.next;
			if(temp.next == null)
				throw new Exception("Out of Range");
		}
		Node toAdd = new Node(data);
		toAdd.next = temp.next;
		toAdd.pre = temp;
		temp.next = toAdd;
		return toAdd.data;
	}
	public int removeFirst()throws Exception
	{
		if(isEmpty())
			throw new Exception("Remove From front not allowewd in Empty list");

		Node toRemove = head;
		head = head.next;
		return toRemove.data;		
	}
	public int removeLast()throws Exception
	{
		// if list Empty
		if(isEmpty())
			throw new Exception("Remove From front not allowewd in Empty list");

		Node temp = head;
		// if it is first node 
		if(temp.next == null)
		{
			Node toRemove = head;
			head = head.next;
			return toRemove.data;		
		}
		// if it is last Node 
		while (temp.next.next != null)
			temp = temp.next ;
	
		Node toRemove = temp.next;	
		temp.next = null;
		return toRemove.data;
	}
	public int remove(int pos)throws Exception
	{
		if(isEmpty())
			throw new Exception("Remove From front not allowewd in Empty list");
		
		//if First Node 
		if(pos == 1)
		{
			Node toRemove = head;
			head = head.next;
			return toRemove.data;		
		}
		
		Node temp;
		temp = head;
		for(int i=1; i<pos-1 && temp != null; i++)
			temp = temp.next;
		
		if(temp.next == null)
			throw new Exception("Out of Range");
		
		Node toRemove = temp.next;//store Deleteing Element
		temp.next = toRemove.next;//unlink the deleting node
		toRemove.next.pre = temp;
		return toRemove.data;
	}
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	public void sort()
	{
		Node t, temp = head;
		while(temp != null)
		{
			t = head;
			while(t.next != null)
			{
				if(t.data > t.next.data)
				{
					int swap = t.data;
					t.data = t.next.data;
					t.next.data = swap;
				}
				t = t.next;
			}
			temp = temp.next;
		}
	}
	public int search(int s)
	{
		boolean isFound = false;
		Node t ;
		int pos=0 ;
		for(t=head; t != null; t = t.next)
		{
			pos++;
			if(t.data == s)
				System.out.println(" Element "+s+" Found At "+pos);
				isFound = true;
		}
		if(!isFound)
			System.out.println(" Element Found ");
		return s;
	}
}
