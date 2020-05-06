//Que (1) :- Check String is Anagram or not
//  An Anagram String is that contain sem characters
// of another string , only order of Character can be different 
class Anagram
{
	public static void main(String args[])
	{
		//o(n2) way
		String a = "listen";
		String b = "silent";
		boolean isAnagarm = true;
		/* boolean visited[] = new boolean[b.length()];
	
		if(a.length() == b.length())
		{
			for(int i=0; i<a.length(); i++)
			{
				char c = a.charAt(i);
				isAnagarm = false;
				for(int j=0; j<b.length(); j++)
				{
					if(b.charAt(j) == c && !visited[j])
					{
						visited[j] = true;
						isAnagarm = true;
						break;
					}
				}	
				if(!isAnagarm)
					break;
			}
		}*/
		//Optimized Way :- o(n)
		int al[] = new int[256];
		
		for(int c : a.toCharArray())
		{
			int index = (int) c;
			al[index]++;
		}
		for(int c : b.toCharArray())
		{
			int index = (int) c;
			al[index]--;
		}
		for(int i=0; i<256; i++)			
		{
			if(al[i] != 0)
			{
				isAnagarm = false;
				break;
			}
		}
		if(isAnagarm)
			System.out.println(" String is Anagram ");
		else
			System.out.println(" String is Not Anagram ");
	}
}