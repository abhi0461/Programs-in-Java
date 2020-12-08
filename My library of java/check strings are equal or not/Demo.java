/*
Problem statement : 2. Write a program which 2 strings from user and check whether
contents of two strings are equal or not.
Input : Marvellous Infosystems
 Marvellous Infosystems
Output : TRUE 
 */

 import java.lang.*;
 import java.util.*;

class Display
{
    public boolean CheckEqual(String str1 , String str2)
    {
        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();

        if(arr.length != brr.length)
        {
            return false;
        }
        int j = 0,i = 0;
        if(i < arr.length)
        {
            while(i < arr.length)
            {
                if(arr[i] != brr[j])
                {
                    return false;
                }
                i++;
                j++;
            }
        }
        return true;   
    }
}

 class Demo
 {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter first string");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string");
        String str2 = sobj.nextLine();

        Display dobj = new Display();

        boolean bret = dobj.CheckEqual(str1,str2);

        if(bret == true)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
 }