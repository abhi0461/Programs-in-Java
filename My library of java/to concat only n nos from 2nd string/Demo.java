/*
Problem statement : 1. Write a java program which accepts 2 strings from user and
concat N characters of second string after first string.Value of N
should be accepted from user.
Note : If third parameter is greater than the size of second string
then concat whole string after first string.
Input : "Marvellous Infosystems"
 "Logic Building"
 5
Output : "Marvellous Infosystems Logic"
 */

 import java.lang.*;
 import java.util.*;

class Display
{
    public String Concat(String str1, String str2)
    {
        str1 = str1.concat(" ").concat(str2);

        return str1;
    }

    public String ConcatX(String str1 , String str2 , int no)
    {
        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();
        if(no > brr.length)
        {
            no = brr.length;
        }
        int l = arr.length + no + 1;
        char result[] = new char[l];
        int j = 0,k = 0, i  = 0;
        while(i < arr.length)
        {
            result[j] = arr[i];
            j++; 
            i++;
        }
        j++;
        while(k < no)
        {
            result[j] = brr[k];
            j++;
            k++;
        }
        String strresult = String.valueOf(result); 

        return strresult;
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

        System.out.println("Enter number of charecters of second string you want to concat with first string :");
        int no = sobj.nextInt();

        Display dobj = new Display();

        String concatx = dobj.ConcatX(str1,str2,no);
        //String concat = dobj.Concat(str1,str2);

        System.out.println("Result of my function : " + concatx);
        //System.out.println("Result of inbuilt function : " + concat);


    }
 }