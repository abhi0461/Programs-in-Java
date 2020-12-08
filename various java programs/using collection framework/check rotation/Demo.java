// Check rotation of string

//Input 
//String1 :  HelloIndiaWorld
//String2 :  IndiaWorldHello
//Output
// True

import java.lang.*;
import java.util.*;

class Check
{
	public boolean Rotation(String str1, String str2)
	{
		String str3 = str1 + str1;

		if(str3.contains(str2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Demo
{
	public static void main(String args[])throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = sobj.nextLine();

		System.out.println("Enter second String");
		String str2 = sobj.nextLine();

		Check cobj = new Check();
		boolean bret = cobj.Rotation(str1, str2);

		if(bret == true)
		{
			System.out.println("Strings are in rotation");
		}
		else
		{
			System.out.println("Strings are not in rotation");
		}
	}
}