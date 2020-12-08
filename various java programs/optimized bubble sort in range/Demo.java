import java.lang.*;
import java.util.*;

class Bubble
{
	public void sort(int arr[], int start, int end)
	{
		int i = 0, j = 0, temp = 0;
		boolean flag = true;
		for(i = 0; i <= (end-start) && flag == true; i++)
		{
			flag = false;
			for( j = start; j < end-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("count : " + i);
			for(int k = 0; k < arr.length; k++)
			{
				System.out.print(arr[k] + "\t");
			}
			System.out.println();
			
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
		System.out.println("Enter the starting point");
		int start = sobj.nextInt();

		System.out.println("Enter the ending point");
		int end = sobj.nextInt();

		Bubble obj = new Bubble();
		obj.sort(arr,start,end);

		System.out.println("Array after sorting :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();

	}
}