import Marvellous.MarvellousArray;
import java.lang.*;
import java.util.*;

class Searching extends MarvellousArray
{
	public Searching(int size)
	{
		super(size);
	}
	public boolean LinearSearch(int no)
	{
		int i = 0;
		boolean flag = false;
		while( i < arr.length)
		{
			if(arr[i] == no)
			{
				return true;
			}

			i++;
		}
		return flag;
	}

	public boolean LinearSearchBI(int no)
	{
		int start = 0, end = 0;
		boolean flag = false;
		for(start = 0, end  = arr.length-1; start <= end; start++,end--)
		{
			if((arr[start] == no)||(arr[end] == no))
			{
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean CheckSorted()
	{
		boolean flag = true;
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean BinarySearch(int no)
	{
		int start = 0, end = 0, medium = 0;
		boolean flag = false;
		end = arr.length-1;
		if(CheckSorted() == false)
		{
			System.out.println("Array is not sorted");
			return false;
		}

		while(start <= end)
		{
			medium = (start + end)/2;

			if((medium == no)||(start == no)||(end == no))
			{
				flag = true;
				break;
			}
			if(no < medium)
			{
				end = medium -1;
			}
			if(no > medium)
			{
				start = medium +1;
			}
		} 
		return flag;
	}
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the size of array");
        int size = sobj.nextInt();
        Searching obj = new Searching(size);

        obj.Accept();
        obj.Display();
           
        System.out.println("Enter the value to search");
        int value = sobj.nextInt();


//       	boolean bret = obj.LinearSearch(value);
//      	boolean bret = obj.LinearSearchBI(value);
       boolean bret = obj.BinarySearch(value);

        if(bret == true)
        {
        	System.out.println("Element is present in array");
        }
        else
        {
       		System.out.println("Element is absent in array");
        }

    }
}