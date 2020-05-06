import java.util.*;
class Arraylist
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		al.add("java");
		al.add("c");
		al.add("c++");
		al.add("c#");
		
		al.add(1,"Android");
		
		System.out.println(al);
		System.out.println("Removed Element 'c' : "+al.remove("c"));
		System.out.println(al);
		System.out.println("Size of an ArrayList is : "+al.size());
		
		System.out.println("Is java is in ArrayList : "+al.contains("java"));
		System.out.println("I Want Android  : "+al.get(1));
		
		Object[] obj = al.toArray();
		System.out.println("Object Array is : ");
		for(Object o : obj)
			System.out.println("Object is :"+o);
		
		al.set(2,"html");
		System.out.println("After Replace : "+al);
		
		Collections.sort(al);
		System.out.println("After Sorting : "+al);
		
		System.out.println("Index of Android : "+al.indexOf("Android"));
		
		al.clear();
		
		System.out.println(al+ " "+"is list empty after clear: "+al.isEmpty());
	}
}