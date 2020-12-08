/*
 4. Java program to read and add two distances using class
In this java program, we will read two distances in feet and inches and
find their sum, here program is implementing using class and objects
concept.
Given program is used to read two distances (in feet and inches) and
print their sum in feet and inches, note that if total inches are more than
12 then it would be consider as 1 feet.
Example:
Input:
Enter first distance:
Enter feet: 20
Enter inches: 10
Enter second distance:
Enter feet: 20
Enter inches: 10
Output:
Total distance is:
Feet: 41 Inches: 8 
*/
import java.lang.*;
import java.util.*;

class Add
{
	public void Distance(int feet1, int inche1, int feet2, int inche2)
	{
		int newfeet = feet1 + feet2;
		int newinche = inche1 + inche2;
		/*if(inche1 + inche2 >= 12)
		{
			newfeet = newfeet+1;
			newinche = (inche1 + inche2)-12;
		}*/
		int div = 0,rem = 0;
		if(inche1 + inche2 >= 12)
		{
			div = (inche1 + inche2)/12;
			rem = (inche1 + inche2)%12;
			newfeet = newfeet + div;
			newinche = rem;
		}	
		System.out.println("Total distance in Feet and Inches is : ");
		System.out.println("Feet : "+newfeet);
		System.out.println("Inches : "+newinche);
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the First distance : ");
		System.out.println("Feet : ");
		int feet1 = sobj.nextInt();
		System.out.println("Inches : ");
		int inche1 = sobj.nextInt();
		
		System.out.println("Enter the Second distance : ");
		System.out.println("Feet : ");
		int feet2 = sobj.nextInt();
		System.out.println("Inches : ");
		int inche2 = sobj.nextInt();
		
		
		Add cobj = new Add();
		cobj.Distance(feet1,inche1,feet2,inche2);

	}
}