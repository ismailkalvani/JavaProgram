//Que (2) :- Reverse a given Stiring Word by Word 
//condition :- String can contain more than one space at both side ,
// you need to place only one space , unnessasory shoud br removed 
class Reversestring 
{
	//optimized way  o(n)
	public static void main(String args[])
	{
		String s = "The sky is blue";
		System.out.println(reverseString(s));
	}
	static String reverseString(String s)
	{
		int i = s.length()-1;
		String ans = "";
		while (i >= 0)
		{
			while(i>=0 && s.charAt(i) == ' ') i--;
			
			int j = i;
			
			if (i < 0) break;
			
			while(i>=0 && s.charAt(i) != ' ') i--;
			
			if(ans.isEmpty())
				ans = ans.concat(s.substring(i+1,j+1));
			
			else
				ans = ans.concat(" "+s.substring(i+1,j+1));
		}
		return ans;
	}
}