

import java.lang.*;

import java.util.*;

class Digits
{
    void CheckStrong(int start, int end)
    {
        int add = 0;
        int fact[] = {1,1,2,6,24,120,720,5040,40320,362880};
       

        while(start <= end)
        {
            int temp = start;
            while(temp != 0)
            {

                int i = temp % 10;
                temp = temp /10;

                add = fact[i] + add;

            }
            if(add == start)
            {
                System.out.println("Strong no is :"+ add);
            }
            start++;
            add = 0;
        }
    }
}

class Demo
{
    public static void main(String arg[])
    {
        int value1,value2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        value1 = sobj.nextInt();

        System.out.println("Enter second number");
        value2 = sobj.nextInt();
        
        Digits aobj = new Digits();
         aobj.CheckStrong(value1,value2);
        
    }    
}

