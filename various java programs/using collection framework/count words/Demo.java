// Count no of words 

import java.lang.*;
import java.util.*;

class Check
{
	public int CountWords(String str)
	{
		return((str.split(" ")).length);
	}
}

class Demo1
{
	public static void main(String args[])throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = sobj.nextLine();

		Check cobj = new Check();
		int iret = cobj.CountWords(str1);

		System.out.println("Number of words in string are : "+iret);
		
	}
}