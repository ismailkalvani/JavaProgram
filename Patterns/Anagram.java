class Anagram
{
	public static void main(String args[])
	{
		String a = "cat";
		String a = "act";
		boolean isAnagarm = false;
		for(int i=0; i<a.length(); i++)
		{
			char c = a.charAt(i);
			for(int j=0; j<b.length(); j++)
			{
				if(b.charAt(j) == c)
				{
					isAnagarm = true;
					break;
				}
			}
			if(!isAnagarm)
				break;
		}
		if(isAnagarm)
			System.out.println(" String is Anagram ");
		else
			System.out.println(" String is Anagram ");
	}
}