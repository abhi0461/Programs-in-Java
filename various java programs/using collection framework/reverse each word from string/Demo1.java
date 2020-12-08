// Reverse each word from the string 

import java.lang.*;
import java.util.*;

class Display
{
	void LargestWord(String str)
	{
		String []arr = str.split(" ");
		String temp = null;
		StringBuilder newstring = new StringBuilder();
		for(String s : arr)
		{
			StringBuilder sb = new StringBuilder(s);
			temp = sb.reverse().toString();
			newstring.append(temp+" ");

		}
		System.out.println("String after reversing : ");
		System.out.println(newstring);
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