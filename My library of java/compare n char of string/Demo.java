/*
Problem statement : 3. Write a program which 2 strings from user and check whether
first N contents of two strings are equal or not.
Note : If third parameter is greater than the size of second string
then concat whole string after first string.
Input : Marvellous Infosystems
 Marvellous Logic Building
 10
Output : TRUE 
 */

 import java.lang.*;
 import java.util.*;

class Display
{
    public boolean CheckEqual(String str1 , String str2, int no)
    {
        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();

        if(no > brr.length)
        {
            no = brr.length;
        }

        /*if(arr.length != brr.length)
        {
            return false;
        }*/
        int j = 0,i = 0;
        if((i < arr.length)&&(i < no))
        {
            while((i < arr.length)&&(i < no))
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

        System.out.println("Enter number of charecters you want to check :");  
        int no = sobj.nextInt();

        Display dobj = new Display();

        boolean bret = dobj.CheckEqual(str1,str2,no);

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