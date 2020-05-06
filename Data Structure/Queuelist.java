import myqueuelist.Mylinkqueue;
class Queuelist
{
	public static void main(String args[])throws Exception
	{
		Mylinkqueue lq = new Mylinkqueue();
		lq.enqueue(10);
		lq.enqueue(20);
		lq.enqueue(30);
		lq.enqueue(40);
		lq.enqueue(50);
		System.out.println("Dispaly Queue");
		lq.displayqueue();
		System.out.println();
		System.out.println("Deleted element : "+lq.dequeue());
		System.out.println("Dispaly Queue");
		lq.displayqueue();
		
	}
}