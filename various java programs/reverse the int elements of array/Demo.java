/*
1. Write java program which accept array from user and reverse each
number of that array.
Input : 89 687 56 549 87 9
Output : 98 786 65 945 78 9 
*/

import java.lang.*;
import java.util.*;
import java.lang.Math;

class DisplayArray
{
    public int[] ReverseArray(int arr[])
    {
        int value = 0,powr = 0,temp = 0,icnt = 0,value1 = 0;
        double newvalue = 0.0;
        for(int i = 0; i < arr.length; i++)
        {
            icnt = 0;
            newvalue = 0.0;
            value = arr[i];
            value1 = arr[i];
            for(int k = 0; value1 != 0; k++)
            {
                value1 = value1 / 10;
                icnt++;
            }
            for(int j = 1,por = icnt-1; j <= icnt; j++,por--)
            {
                temp = value % 10;
                newvalue = newvalue +(temp * (Math.pow(10,por)));
                value = value / 10;
            }
            arr[i] = (int)newvalue;
            
           // System.out.println(newvalue);
        }   
        return arr;
            
    }
    
}

class Demo
{
    public static void main (String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number of elements you want to insert in array : ");
        int no = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        DisplayArray dobj = new DisplayArray();

        int brr[] = dobj.ReverseArray(arr); 

        System.out.println("Elements in array after reversing the number : ");
        for(int j = 0; j < no; j++)
        {
            System.out.print(brr[j] + "\t");
        }        
    }
}
