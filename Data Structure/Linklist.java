class Linklist
{
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	boolean isEmpty()
	{		
		return head == null;
	}

	Node head;
	int add(int data)
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
		{
			temp = temp.next;
		}
		temp.next = toAdd;
		return toAdd.data;
	}
	int addBeg(int data)
	{
		Node toAdd = new Node(data);
		toAdd.next = head;
		head = toAdd;
		return toAdd.data;
	}
	int addBet(int data,int pos) throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Add Between list is not allowewd in Empty list");
		}
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
		temp.next = toAdd;
		return toAdd.data;
	}
	int removeFirst()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Remove From front not allowewd in Empty list");
		}
		Node toRemove = head;
		head = head.next;
		return toRemove.data;		
	}
	int removeLast()throws Exception
	{
		// if list Empty
		if(isEmpty())
		{
			throw new Exception("Remove From front not allowewd in Empty list");
		}
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
		{
			temp = temp.next ;
		}
		Node toRemove = temp.next;	
		temp.next = null;
		return toRemove.data;
	}
	int remove(int pos)throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Remove From front not allowewd in Empty list");
		}
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
		{
			temp = temp.next;
		}
			
		if(temp.next == null)
		{
			throw new Exception("Out of Range");
		}
		Node toRemove = temp.next;//store Deleteing Element
		temp.next = toRemove.next;//unlink the deleting node
		return toRemove.data;
	}
	void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	public static void main(String []args)throws Exception
	{
		Linklist ll = new Linklist();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
	
		ll.print();
		System.out.println();
		
		System.out.println("Deleted Element : "+ll.remove(4));
		System.out.println();
		ll.print();
		
	}
}