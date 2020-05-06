import mystacklist.Mylinkstack;
class Stacklist
{
	public static void main(String args[])throws Exception
	{
		Mylinkstack ls = new Mylinkstack();
		ls.push(70);
		ls.push(20);
		ls.push(40);
		ls.push(90);
		ls.push(50);
		System.out.println("Peek from stack");
		ls.peek();
		System.out.println();
		//System.out.println("Deleted element : "+ls.pop());
		//ls.bsort();
		//System.out.println("Peek from stack after sort");
		//ls.peek();
		
		ls.search(20);
		//System.out.println("Peek from stack after search");
		ls.peek();
		
	}
}