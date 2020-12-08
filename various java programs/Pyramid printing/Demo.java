/*
3. Write java program to print below pattern.
 * * * * *
 * * * *
  * * *
   * *
 	* 
 */
import java.lang.*;
import java.util.*;

class Pattern
{
	int plus ,mins = 0;
	public void Pyramid(int num)
	{
		for(int i = num; i >= 1; i--)
		{
			plus = i;
			mins = i;
			for(int j = (num*2),k = 1; j >= 1 ; j--,k++)
			{
				if(j < num)
				{
					if(j <= num-(mins-1))
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
				if(j >= num)
				{
					if(j >= num+(plus))
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
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