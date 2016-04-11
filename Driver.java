
public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		String s3 = "H0w ae3 y0u?";
		System.out.println(Driver.removeVowels(s));
		System.out.println(Driver.removeConsonants(s2));
		System.out.println(Driver.removeDigits(s3));
	}
	
	static String removeVowels(String s)
	{
		String answer = ""; 
		String allVowels = "aeiou";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(allVowels.indexOf(s.charAt(i)) == -1)
			{
				answer = answer + s.charAt(i);
			}
		}
		return answer; 
	}
	
	static String removeConsonants(String s)
	{
		String answer = "";
		String allConsonants = "bcdfghjklmnpqrstvwxyz";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(allConsonants.indexOf(s.charAt(i)) == -1)
			{
				answer = answer + s.charAt(i);
			}
		}
		return answer;
	}
		
	static String removeDigits(String s)
	{
		String answer = "";
		String allDigits = "0123456789";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(allDigits.indexOf(s.charAt(i)) == -1)
			{
				answer = answer + s.charAt(i);
			}
		}
		return answer;
		
		
	}
		
	//return the first occurence in s where c is found or -1 if 
	//it was not found - we can't use the String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still kicking....
		return -1;
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
	
	//this method should display on a single line the input String
	//in reverse: "hello" -> "olleh"
	static String reverseString(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >= 0; i = i - 1)
		{
			answer = answer + s.charAt(i);
		}
		return answer;
	}
}