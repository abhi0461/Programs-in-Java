// Sorting in Matrix : by using Selection sort algorithm in row.

import java.lang.*;
import java.util.*;

class Selection
{
	public void sort(int arr[])
	{
		int pass = 0, j = 0, temp = 0, min_i = 0;
		for(pass = 0; pass < arr.length-1; pass++)
		{
			min_i = pass;
			for(j = pass+1; j < arr.length; j++)
			{
				if(arr[min_i] < arr[j])
				{
					min_i = j;
				}
			}
			if(arr[pass] != arr[min_i])
			{
				temp = arr[pass];
				arr[pass] = arr[min_i];
				arr[min_i] = temp;
			}
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
		System.out.println("Enter no of rows");
		int row = sobj.nextInt();
		System.out.println("Enter no of col");
		int col = sobj.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter the elements in the array");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sobj.nextInt();
			}
		}
		
		System.out.println("Entered elements are :");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		Matrix obj = new Matrix();
		obj.RowSort(arr);

		System.out.println("Array after sorting :");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}