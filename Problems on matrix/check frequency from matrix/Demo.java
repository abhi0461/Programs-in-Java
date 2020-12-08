/*
2. Write a program which accept matrix and one number from user and return
frequency of that number. 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
    public int Frequency(int arr[][],int no)
    {
        int icnt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == no)
                {
                    icnt++;
                }
            }
        }        
        return icnt;
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

        System.out.println("Enter the number");
        int no = sobj.nextInt();

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

        int ret = mobj.Frequency(Arr,no);

        System.out.println("Frequency of number is : " + ret);

           
    }
}