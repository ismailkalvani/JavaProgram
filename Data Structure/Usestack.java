import mystack.Mystack;
class Usestack
{
	public static void main(String args[])throws Exception
	{
		Mystack s1 = new Mystack();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.push(500);
		s1.peep();
		
		System.out.println("After Deleting Two Element");
		s1.pop();
		s1.pop();
		s1.peep();

	}
}