//Que 3 :- Program to Singleton pattern 
//ans :- Singleton pattern class can be done when you allow only one obj of it
// used in logging,caching 
class Singleton 
{
	public static void main(String args[])
	{
		AppConfig obj1 = AppConfig.getInstance();
		AppConfig obj2 = AppConfig.getInstance();
		
		Normal n1 = new Normal();
		Normal n2 = new Normal();
		
		System.out.println("Normal Object useing diffrent memory, it causes trouble Sometime..");
		System.out.println("\n"+n1);
		System.out.println(n2);
		
		System.out.println("\nboth useing sem memory, say goodbye to lagging :-)");
		System.out.println("\n"+obj1);
		System.out.println(obj2);
	}
}
class AppConfig
{
	private AppConfig()
	{
		
	}
	
	private static AppConfig obj = null;
	
	public static AppConfig getInstance()
	{
		if (obj == null)
			obj = new AppConfig();
		return obj;
	}
}
class Normal 
{
	public Normal()
	{
		
	}
}