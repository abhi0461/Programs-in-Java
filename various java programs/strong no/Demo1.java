

import java.lang.*;

import java.util.*;

class Digits
{
    boolean CheckStrong(int iNo)
    {
        int iDigit = 0;
        int i , j = 0;
        int iFact = 0;
        int iDigit = 0;
        int iStNo = 0;

        j = iNo;
        
        while(iNo!=0)
        {
            iFact = 0;


        iDigit = iNo%10;

        for(i=1;i<iDigit;i++)
        {
            iFact = iDigit * i;

        }

        iStNo = iStNo+iFact; 

        iNo= iNo/10;


     }  

     if(iStNo == j)
     {
        return true;
     }
     else
     {
        return false;
     }


        
    }}

class Demo
{
    public static void main(String arg[])
    {
        int value = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        value = sobj.nextInt();

        
        Digit aobj = new Digit();
        boolean bret = aobj.CheckStrong(value);
        if(bret == true)
        {
        System.out.println("No is strong ");
        }
        else
        {
            System.out.println("No is not strong ");
        }
    }    
}

