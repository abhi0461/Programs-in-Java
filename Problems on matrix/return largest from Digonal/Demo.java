/*
3. Write a program which accept matrix and return largest number from both the
diagonals 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
    public int[] Largest(int arr[][])
    {
        int large1 = 0,large2 = 0;
        int brr[] = new int[2];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if((i == j)&&(arr[i][j] > large1))
                {
                    large1 = arr[i][j];
                }
                if((i+j) == (arr.length-1))
                {
                    large2 = arr[i][j];
                }
            }
        }
        brr[0] = large1;
        brr[1] = large2;

        /*for(int i = 0, j = 0; (i < arr.length)&&(j < arr[i].length); i++, j++)
        {
            if(arr[i][j] > large1)
                {
                    large1 = arr[i][j];
                }
        } */       
        return brr;
    }
}


class Demo
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number of rows");
        int row = sobj.nextInt();

        System.out.println("Enter the number of columns");
        int col = sobj.nextInt();

        int Arr[][] = new int[row][col];

        System.out.println("Enter the elements in Matrix");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.println("with row " + i + " and column " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        Matrix mobj = new Matrix();

        int crr[] = mobj.Largest(Arr);

        System.out.println("Largest no in first digonal is : " + crr[0]);
        System.out.println("Largest no in Last digonal is : " + crr[1]);

           
    }
}