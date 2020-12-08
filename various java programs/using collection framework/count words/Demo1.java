// Count frequency of given word 

import java.lang.*;
import java.util.*;

class Check
{
	public int CountWords(String str, String word)
	{
		String []arr = str.split(" ");
		int icnt = 0;
		for(String s : arr)
		{
			if(s.equals(word) == true)
			{
				icnt++;
			}
		}
		return icnt;
	}
}

class Demo1
{
	public static void main(String args[])throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first String");
		// to accept the string upto next line ie. upto (enter key) end
		String str1 = sobj.nextLine();
		
		System.out.println("Enter the word to check frequency");
		// to accept the string without white space 
		String str2 = sobj.next();
		
		Check cobj = new Check();
		int iret = cobj.CountWords(str1, str2);

		System.out.println("Number of words in string are : "+iret);
		
	}
}