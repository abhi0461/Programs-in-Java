import java.lang.*;
import java.util.*;

class Display
{
	public void Jumps(int arr[])
	{

		int cnt = 0,jump = 0;
		for(int i = 0; i < arr.length; i++)
		{
			cnt++;
			jump = jump + arr[i];
			if(jump >= arr.length)
			{
				System.out.println("Total jumps are : "+ cnt);
				break;
			}
		}
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Size of array");
		int size = sobj.nextInt();
		int arr[];
		arr = new int[size];
		System.out.println("Enter elements in the array");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sobj.nextInt();
		}
		Display dobj = new Display();
		dobj.Jumps(arr);
	}
}