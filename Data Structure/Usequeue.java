import myqueue.Myqueue;
class Usequeue
{
	public static void main(String args[])throws Exception
	{
		Myqueue q1 = new Myqueue();
		q1.push(100);
		q1.push(200);
		q1.push(300);
		q1.push(400);
		q1.push(500);
		q1.peep();
		
		System.out.println("After Deleting Two Element");
		q1.pop();
		q1.pop();
		q1.peep();

	}
}