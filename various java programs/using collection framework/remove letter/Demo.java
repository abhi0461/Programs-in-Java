/*
4.Write a java program which accept string and one character from user
and remove that character from string.
Input : India isDemoIndia
 		i
Output : IndasDemoInda 
*/
import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);

			System.out.println("Enter the string");
			String str = sobj.nextLine();

			System.out.println("Enter the character to remove from string");
			char ch = sobj.next().charAt(0);

			MyArray mobj = new MyArray();
		 	String ret = mobj.RemoveLetter(str, ch);
		 	
	 	 	System.out.println("New string after operation is : ");
		 	System.out.println(ret);
		 	
		}
		catch(Exception obj)
		{}
	}
}

class MyArray
{
	String RemoveLetter(String str, char ch) throws Exception
	{
		int i = 0, j = 0, k = 0;

		char []arr = str.toCharArray();
		char []brr = new char[arr.length];

		for(i = 0, j = 0; i < arr.length; i++, j++)
		{
			if(arr[i] == ch)
			{
				j--;
			}
			else
			{
				brr[j] = arr[i];
			}
		}
		String newstr = new String(brr);
		return newstr;
	}
}