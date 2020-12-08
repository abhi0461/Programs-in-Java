/*
1. Write java program which accept N numbers from user and accept
one another number as NO , check whether NO is present or not.
Input : N : 6
 NO: 66
 Elements : 85 66 3 66 93 88
Output : TRUE
Input : N : 6
 NO: 12
 Elements : 85 11 3 15 11 111
Output : FALSE 
*/


import java.lang.*;
import java.util.*;

class Check
{
    public Boolean CheckPresent(int brr[],int length,int value)
    {
        int i = 0;
        for (i = 0; i < length-1; i++)
        {
            if(brr[i] == value)
            {
                break;
            }
        }
        if(brr[i] == value)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}

class Demo
{
    public static void main(String args[])
    {
        int no = 0;
        int no2 = 0, i = 0;
        Boolean bRet = false;
        int Arr[];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        no = sobj.nextInt();

        Arr = new int[no];
        System.out.println("Enter Numbers in array");
        for(i = 0; i < no ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter another number");
        no2 = sobj.nextInt();

        Check cobj = new Check();

        bRet = cobj.CheckPresent(Arr,no,no2);
        
        if(bRet == true)
        {
            System.out.println("Number is present");
        }
        else{
            System.out.println("Number is not present");
        }
    
    }

}

