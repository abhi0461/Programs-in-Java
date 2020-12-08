/*
Problem Statement : Reverse the words from the string. 
*/

import java.lang.*;
import java.util.*;

class Demo
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        Display dobj = new Display();

        dobj.Reverse(Arr);
        
    }
}

class Display
{
    public void Reverse(char Arr[])
    {
        int size = Arr.length;
        char temp = 0;
        int i = 0, j = 0, icnt = 0, start = 0, end = 0;
        int k = 0, l = 0;

        while(i < size)
        {
            if(Arr[i] == ' ')
            {
                while((i < size)&&(Arr[i] == ' '))
                {
                    i++;
                    System.out.print("_");
                }
            }
            else if((i < size)&&(Arr[i] != ' '))
            {
                start = i;
                while((i < size)&&(Arr[i] != ' '))
                {
                    i++;
                }   
                end = i-1;
                l = end;
                for(k = start; k < end; k++)
                {
                    temp = Arr[k];
                    Arr[k] = Arr[end];
                    System.out.print(Arr[k]);
                    Arr[end] = temp;
                    end--;
                }
                for( ; k < l+1 ; k++)
                {
                    System.out.print(Arr[k]);
                }
            }
        }
    }
}

