// Check frequency of charecters of string


import java.lang.*;
import java.util.*;

class Check
{
	public void Frequency(String str)
	{
		char []arr = str.toCharArray();
		HashMap <Character, Integer> hobj = new HashMap <Character, Integer>();

		for(char c : arr)
		{
			if(hobj.containsKey(c))
			{
				hobj.put(c,hobj.get(c)+1);
			}
			else
			{
				hobj.put(c,1);
			}
		}

		System.out.println("Frequency of each Character is : ");
		System.out.println(hobj);
	}
}

class Demo
{
	public static void main(String args[])throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sobj.nextLine();

		Check cobj = new Check();
		cobj.Frequency(str);

	}
}