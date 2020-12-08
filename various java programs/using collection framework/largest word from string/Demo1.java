// Display the largest word from the string 

import java.lang.*;
import java.util.*;

class Display
{
	void LargestWord(String str)
	{
		String []arr = str.split(" ");
		int max = 0;
		String temp = null;
		for(String s : arr)
		{
			if(s.length() > max)
			{
				max = s.length();
				temp = s;
			}
		}
		System.out.println("The largest word from the string is : "+temp+", With length : "+max);
	}
}

class Demo1
{
	public static void main(String args[])throws Exception
	{
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Enter String");
		String str1 = sobj.nextLine();
	
		Display dobj = new Display();
		dobj.LargestWord(str1);

	}
}