/*
5. Pythagorean Triplet in an array
Given an array of integers, write a function that returns true if
there is a triplet (a, b, c) that satisfies a2 + b2 = c2. 
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

			System.out.println("Enter size of array");
			int size = sobj.nextInt();
			int arr[] = new int[size];

			System.out.println("Enter elements in array :");
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = sobj.nextInt();
			}
			
			MyArray mobj = new MyArray();
		 	boolean bret = mobj.isTriplet(arr);
		 	if(bret == true)
		 	{
			 	System.out.println("There is a Pythagorean Triplet in array!!!");
		 	}
		 	else
		 	{
		 		System.out.println("There is not a Pythagorean Triplet in an array!!!");
		 	}
		}
		catch(Exception obj)
		{}
	}
}

class MyArray
{
	boolean isTriplet(int arr[]) throws Exception
	{
		int a = 0, b = 0, c = 0;
		int i = 0, j = 0, k = 0;

		for(i = 0; i < arr.length; i++)
		{
			a = arr[i]*arr[i];
			for(j = i+1; j < arr.length-1; j++)
			{
				b = arr[j]*arr[j];
				for(k = j+1; k < arr.length; k++)
				{
					c = arr[k]*arr[k];
					if((a + b == c)||(b + c == a)||(c + a == b))
					{
						System.out.println("a : "+arr[i]+", b : "+arr[j]+", c : "+arr[k]);
						return true;
					}
				}
			}
		}
		return false;
	}
}