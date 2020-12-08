/*
Equilibrium Index :(ashi index jichya left an rigth side chya saglya elements chi addition equal yete)
Array [5,7,8,4,5,9,6,4-4,9]
Output : 4 
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
		 	int ret = mobj.EquilibriumIndex(arr);
		 	if(ret == -1)
		 	{
			 	System.out.println("There is no Equilibrium index ");
		 	}
		 	else{
		 	System.out.println("Equilibrium index is : "+ret);
		 	}
		}
		catch(Exception obj)
		{}
	}
}

class MyArray
{
	int EquilibriumIndex(int arr[]) throws Exception
	{
		int totalsum = 0;
		int i = 0;
		int partsum = 0;

		for(i = 0; i < arr.length; i++)
		{
			totalsum = totalsum + arr[i];
		}

		for(i = 0; i < arr.length; i++)
		{
			totalsum = totalsum - arr[i];
			if(totalsum == partsum)
			{
				return i;
			}
			partsum = partsum + arr[i];
		}

		return -1;
	}
}