// Sorting in Matrix : by using Selection sort algorithm in digonal.

/******************Incomplete*************************/

import java.lang.*;
import java.util.*;

class Matrix
{
	public void DigonalSort(int arr[][])
	{
		Scanner sobj = new Scanner(System.in);
		int pass = 0, i = 0, j = 0, temp = 0, min_i = 0;
		int crr[] = new int[arr[i].length];
		for(i = 0; i < arr.length; i++)
		{
			for(pass = 0; pass < arr[i].length-1; pass++)
			{
				if(i == pass)
				{
					crr[i] = arr[i][j];
				}
			}
		}
		int brr[] = new int[crr.length];
		for(int k = 0; k < brr.length-1; k++)
		{
			if(brr[k] > brr[k+1])
			{
				temp = brr[k];
				brr[k] = brr[k+1];
				brr[k+1] = temp;
			}
		}
		for(int k = 0; k < brr.length; k++)
		{
			System.out.print(brr[k]+"\t");
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
		obj.DigonalSort(arr);
/*
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
*/
	}
}