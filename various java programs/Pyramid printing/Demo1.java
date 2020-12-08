/*
1. java program to print pyramid of characters using class
Enter Number : 5
 		A
  	  A B A
 	A B C B A
  A B C D C B A
A B C D E D C B A 
*/
import java.lang.*;
import java.util.*;

class Pattern
{
	int plus ,mins = 0;
	public void Pyramid(int num)
	{
		for(int i = 1; i <= num; i++)
		{
			plus = i;
			mins = i;
			char ch = 'A';
			for(int j = 1,k = num; j < (num*2); j++,k--)
			{
				if(j <= num)
				{
					if(j >= num-(mins-1))
					{
						System.out.print(ch);
						ch++;
					}
					else
					{
						System.out.print(" ");
					}
				}
				if(j > num)
				{
					if(j == num+1)
					{
						ch--;
					}
					ch--;
					if(j <= num+(plus-1))
					{
						System.out.print(ch);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the numnber : ");
		int num = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		pobj.Pyramid(num);

	}
}