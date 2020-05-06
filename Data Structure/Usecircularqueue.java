import mycircularqueue.Mycircularqueue;
class Usecircularqueue
{
	public static void main(String args[])throws Exception
	{
		System.out.println();
		Mycircularqueue qc1 = new Mycircularqueue();
		qc1.push(1);
		qc1.push(2);
		qc1.push(3);
		qc1.push(4);
		qc1.push(5);
		qc1.push(6);
		qc1.push(7);
		qc1.push(8);
		qc1.push(9);
		qc1.push(10);
		
		qc1.peep();
		System.out.println();
		
		System.out.println("After Deleting Two Element");
		qc1.pop();
		qc1.pop();
		qc1.peep();
		System.out.println();

	}
}