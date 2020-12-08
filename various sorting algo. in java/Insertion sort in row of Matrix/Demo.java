import java.lang.*;
import java.util.*;

class Insertion
{
	public void Sort(int arr[])
	{
		int pass = 0, j = 0, key = 0;
		for(pass = 1; pass < arr.length; pass++)
		{
			key = arr[pass];
			j = pass-1;
			while((j>=0)&&(arr[j] > key))
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}

class Matrix
{
	public void RowSort(int arr[][])
	{
		int pass = 0, j = 0, temp = 0, min_i = 0;

		for(int i = 0; i < arr.length; i++)
		{
			for(pass = 0; pass < arr[i].length-1; pass++)
			{
				min_i = pass;
				for(j = pass+1; j < arr[i].length; j++)
				{
					if(arr[i][min_i] > arr[i][j])
					{
						min_i = j;
					}
				}
				if(arr[i][pass] != arr[i][min_i])
				{
					temp = arr[i][pass];
					arr[i][pass] = arr[i][min_i];
					arr[i][min_i] = temp;
				}
			}
		}
		

	}
}
class Demo
{
	public static void main(String args[])throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sobj.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in the array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i]= sobj.nextInt();	
		}
		
		System.out.println("Entered elements are :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"\t");			
		}
		System.out.println();

		
		Insertion obj = new Insertion();
		obj.Sort(arr);

		System.out.println("Array after sorting :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();

	}
}