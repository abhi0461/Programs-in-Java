/*
Problem statement : 4. Accept sing from user and reverse the contents of that string
by toggling the case.
Input : aCBdef
Output : FEDcbA
Output : TRUE 
 */

 import java.lang.*;
 import java.util.*;

class Display
{
    public String ReverseAndToggle(String str1)
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
                    k = -32;
                }

                if((arr[l] >= 'A')&&(arr[l] <= 'Z'))
                {
                    m = 32;   
                }
                else if((arr[l] >= 'a')&&(arr[l] <= 'z'))
                {
                    m = -32;
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

 class Demo
 {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter first string");
        String str = sobj.nextLine();

        Display dobj = new Display();

        String ret = dobj.ReverseAndToggle(str);
        
        System.out.println("String after toogling and reversing : " + ret);
        
    }
 }