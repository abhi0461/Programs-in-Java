

import java.lang.*;

import java.util.*;

class Digits
{
    Boolean CheckStrong(int no)
    {
        int add = 0;
        int fact = 1;
        int temp = no;

        while(no != 0)
        {
            
            int i = temp % 10;
            temp = temp /10;
            while(i != 0)
            {
               
                 fact = fact * i;
                i--;
            }
             add = fact + add;
             fact = 1; 
        }
        if(add == no)
        {
            return true;
        }
        else{
            return false;
        }
    }
}

class Demo
{
    public static void main(String arg[])
    {
        int value = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        value = sobj.nextInt();

        
        Digits aobj = new Digits();
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

