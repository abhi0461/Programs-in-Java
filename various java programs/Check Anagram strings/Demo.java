/*
 Program to check given strings are Anagram or not
This java program will read two strings and check whether they
are anagram strings or not. 

Anagram :  An anagram of a string is another string that contains the same characters,
 		   only the order of characters can be different. 
 		   For example, "abcd" and "dabc" are an anagram of each other.
*/
import java.lang.*;
import java.util.*;

class Check
{
	public String Sort(String str1)
	{
		char []arr1 = str1.toCharArray();
//		char []arr2 = str2.toCharArray();

		for(int i = 0; i < arr1.length; i++)
		{
			char temp;
			for(int j = 0; j < arr1.length-1-i; j++)
			{
				if(arr1[j+1] < arr1[j])
				{
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		String str = new String(arr1);
		return str;
	}
	public int Anagram(String str1 , String str2)
	{
		char []arr1 = str1.toCharArray();	
		char []arr2 = str2.toCharArray();
			
		if(arr1.length != arr2.length)
		{
			System.out.println("length of strings is not same");
			return -1;
		}
		String s1 = Sort(str1);
//		System.out.println("String 1 after sorting : "+ s1);
		String s2 = Sort(str2);
//		System.out.println("String 2 after sorting : "+ s2);
		if(s1.equals(s2) == true)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		String str1 = sobj.next();
		
		System.out.println("Enter the String 2 : ");
		String str2 = sobj.next();

		Check cobj = new Check();
		int ret = cobj.Anagram(str1,str2);

		if(ret == 1)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{	
			System.out.println("Strings are not Anagram");
		}
	}
}