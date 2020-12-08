// Sorting in Matrix : by using Selection sort algorithm in colomn.

import java.lang.*;
import java.util.*;

class Matrix
{
	public void ColSort(int arr[][])
	{
		int i = 0, temp = 0, j = 0, min = 0, pass = 0;
		for(i = 0; i < arr.length; i++)
		{
			for(pass = 0; pass < arr[i].length-1; pass++)
			{
				min = pass;
				for(j = pass+1; j < arr[i].length; j++)
				{
					if(arr[min][i] > arr[j][i])
					{
						min = j;
					}
				} 
				if(arr[pass][i] != arr[min][i])
				{
					temp = arr[pass][i];
					arr[pass][i] = arr[min][i];
					arr[min][i] = temp;
				}
			}
		}
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		System.out.println("Enter number of colomns");
		int col = sobj.nextInt();
		int arr[][] = new int [row][col];

		System.out.println("Enter elements in the array");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sobj.nextInt();
			}
		}

		System.out.println("Entered elements in the array are :");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		Matrix mobj = new Matrix();
		mobj.ColSort(arr);

		System.out.println("Array after colomn sorting :");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}