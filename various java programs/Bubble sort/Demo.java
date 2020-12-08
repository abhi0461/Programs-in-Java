import java.lang.*;
import java.util.*;

class Bubble
{
	public void sort(int arr[])
	{
		int i = 0, j = 0, temp = 0;
		boolean flag = true;
		for(i = 0; i < arr.length && flag == true; i++)
		{
			flag = false;
			for( j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
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
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in the array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		Bubble obj = new Bubble();
		obj.sort(arr);

		System.out.println("Array after sorting :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();

	}
}