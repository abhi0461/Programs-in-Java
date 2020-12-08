/*
Problem statement : 5. Accept string from user and check whether the string is
palindrome or not without considering its case.

Input : 1abccBA1
Output : TRUE 
 */

 import java.lang.*;
 import java.util.*;

class Display
{
    public String CheckPallindrome(String str1)
    {
        char arr[] = str1.toCharArray();
     
        int i = 0, j = 0, k = 0, m = 0;
        char temp = 0;
        int l = arr.length-1;

        for(i = 0; i <= l; i++,l--)
        {
            if(arr[i] == ' ')
            {
                k = 0;
                
            }
            else if(arr[l] == ' ')
            {
                
                m = 0;
            }
            else
            {
                if((arr[i] >= 'A')&&(arr[i] <= 'Z'))
                {
                    k = 32;   
                }
                else if((arr[i] >= 'a')&&(arr[i] <= 'z'))
                {
                    k = 0;
                }

                if((arr[l] >= 'A')&&(arr[l] <= 'Z'))
                {
                    m = 32;   
                }
                else if((arr[l] >= 'a')&&(arr[l] <= 'z'))
                {
                    m = 0;
                }
            }
                temp = (char) (arr[i] + k);
                arr[i] = (char) (arr[l] + m);
                arr[l] = temp;
             
        }   
        String str = String.valueOf(arr);
        return str;
    }
}

class Check
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
        String str = sobj.nextLine();

        Display dobj = new Display();

        String sret = dobj.CheckPallindrome(str);

        String strlower = str.toLowerCase();
        
        Check cobj = new Check();

        boolean bret = cobj.CheckEqual(sret,strlower);

        if(bret == true)
        {
            System.out.println("String is Palllindrome...");
        }
        else
        {
            System.out.println("String is not Palllindrome...");     
        }
        
    }
 }