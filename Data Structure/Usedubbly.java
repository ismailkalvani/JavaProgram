import dubblylist.Dubblylinkedlist;
class Usedubbly
{
	public static void main(String args[])throws Exception
	{
		Dubblylinkedlist dl = new Dubblylinkedlist();
		dl.add(70);
		dl.add(50);
		dl.add(30);
		dl.add(90);
		dl.add(10);
		
		dl.print();
		System.out.println();
		System.out.println("Adding Sorting  ");
		dl.sort();
		System.out.println();
		dl.print();
		
		System.out.println();
		System.out000.println("Adding Searching  "+dl.search(90));
		System.out.println();
		dl.print();
		
		/*System.out.println();
		System.out.println("Removeing Element "+dl.remove(2));
		System.out.println();
		dl.print();*/
	}
}