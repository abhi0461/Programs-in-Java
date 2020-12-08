import java.lang.*;
import java.util.*;
class Demo
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);

			System.out.println("Enter string");
			String str = sobj.nextLine();
			
			MyString mobj = new MyString();
		 	String abc = mobj.AxisFunction(str);
		 	System.out.println(abc);
		}
		catch(Exception obj)
		{}
	}
}
class MyString
{
	String AxisFunction(String str) throws Exception
	{
		char arr[] = str.toCharArray();
		char brr[] = new char[arr.length];
		int i = 0,j = 0;
		for(i = 0, j = 0; i < arr.length-1; i++, j++)
		{
			if(arr[i] == arr[i+1])
			{
				brr[j] = '$';
				i++;
			}
			else
			{
				brr[j] = arr[i];
			}
		}
		brr[j] = arr[i];
		String temp = new String(brr);
		return temp;
	}
}