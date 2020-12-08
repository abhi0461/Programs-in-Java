/*
// Accept N numbers from user.
//Accept one another number and return the nearest  umber to that number.

// Input : N = 10
// Element = 15
//	5	8	12	4	-8	8	10	2	2	0
// Output :	12	

// Input : N = 10
// Element = 2
//	5	8	12	4	-8	8	10	2	2	0
// Output :	2	

// Input : N = 10
// Element = 7
//	5	8	12	4	-8	8	10	2	2	0
// Output :	8

// Input : N = 10
// Element = 25
//	5	8	12	4	-8	8	10	2	2	0
// Output :	12	
*/


import java.lang.*;
import java.util.*;

class DemoArray
{
    public void DisplayNearest(int Arr[], int number)
    {
       
        int i = 0, j = 0;
        int decre = number;
        int incre = number;

        while(1)
        {
            for( i = 0; i < Arr.length -1 ; i++)
            {

                if((Arr[i] == incre)||(Arr[i] == decre))
                {
                    System.out.println("Nearest number is :");
                    System.out.print(Arr[i] + "\t");
                    break;
                
                }
            }
            if((Arr[i] == incre)||(Arr[i] == decre))
            {
                break;   
            }
            decre--;
            incre++;
            
        }
    }
}

class Demo
{
    public static void main(String args[])
    {
        int no = 0, no2 = 0;
        int Arr[];
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no");
        no = sobj.nextInt();
        
        Arr = new int[no];

        System.out.println("Enter elements in array");
        
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        System.out.println("Enter second number");
        no2 = sobj.nextInt();

        DemoArray cobj = new DemoArray();

        cobj.DisplayNearest(Arr,no2);
        
    }
}