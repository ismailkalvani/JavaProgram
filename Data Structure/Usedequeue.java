import mydequeue.Mydequeue;
class Usedequeue
{
	public static void main(String args[])throws Exception
	{
		System.out.println();
		Mydequeue dq1 = new Mydequeue();
		dq1.insertfront(1);
		dq1.insertfront(2);
		dq1.insertfront(3);
		dq1.insertfront(4);
		dq1.insertfront(5);
		dq1.insertrear(6);
		dq1.insertrear(7);
		dq1.insertrear(8);
		dq1.insertrear(9);
		dq1.insertrear(10);
		
		dq1.display();
		System.out.println();
		
		/*System.out.println("After Deleting Element from Front");
		dq1.deletefront();
		dq1.display();
		System.out.println();
		
		System.out.println("After Deleting Element from Rear");
		dq1.deleterear();
		dq1.display();
		System.out.println();*/
	}
}