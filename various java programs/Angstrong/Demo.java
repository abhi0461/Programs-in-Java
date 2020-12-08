/*
2. Write java program which accept N numbers from user and accept
one another number as NO , return index of first occurrence of that
NO.
Input : N : 6
 NO: 66
 Elements : 85 66 3 66 93 88
Output : 1
Input : N : 6
 NO: 12
 Elements : 85 11 3 15 11 111
Output : -1 
*/


import java.lang.*;
import java.util.*;

class Check
{
    public Boolean Amngstrong(int value,int length)
    {
        int i = 0;
        
        int Sum = 0;
        int number = 0;
        number = value;
        for (i = 0; number != 0; i++)
        {
            i = number % 10;
            Sum = (i ^ length) + Sum;
            number = number / 10;
        }
        if(Sum == value)
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
        int length = 0, i = 0;
        Boolean bRet = false;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        no = sobj.nextInt();
        i = no;
        for(length = 1; i != 0 ;length++)
        {
            i = i / 10;
        }
        
        Check cobj = new Check();

        bRet = cobj.Amngstrong(no,length);
        
        if (bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    
    }

}

