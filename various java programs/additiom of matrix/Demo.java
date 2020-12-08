// Sorting in Matrix : by using Selection sort algorithm in row.

import java.lang.*;
import java.util.*;

class Matrix
{
	public void Add(int arr[][], int brr[][])
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = arr[i][j] + brr[i][j];
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

		System.out.println("Enter the elements in 1st Matrix");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sobj.nextInt();
			}
		}
		
		System.out.println("1st matrix is :");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("Enter no of rows");
		int row2 = sobj.nextInt();
		System.out.println("Enter no of col");
		int col2 = sobj.nextInt();

		int brr[][] = new int[row2][col2];

		System.out.println("Enter the elements in 2nd Matrix");
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr[i].length; j++)
			{
				brr[i][j] = sobj.nextInt();
			}
		}
		
		System.out.println("2nd matrix is :");
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr[i].length; j++)
			{
				System.out.print(brr[i][j]+"\t");
			}
			System.out.println();
		}
		
		Matrix obj = new Matrix();
		obj.Add(arr,brr);

		System.out.println("Matrix after Addition :");
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