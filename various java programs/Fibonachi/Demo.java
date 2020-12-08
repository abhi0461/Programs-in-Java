/*
		Fibonacci Series : 0,1,1,2,3,5,8,13,21,34,55....
*/


import java.lang.*;
import java.util.*;

class Check
{
    public void FibSeries(int number)
    {
        int first = 0;
        int Second = 1;
        int third = 0;

        while( number != 0)
        {
            System.out.println(first);
            third = Second + first;
            first = Second;
            Second = third;

            number--;
        }

    }
}

class Demo
{
    public static void main(String args[])
    {
        int no = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        no = sobj.nextInt();
        
        
        Check cobj = new Check();

         cobj.FibSeries(no);
        
    
    }

}

