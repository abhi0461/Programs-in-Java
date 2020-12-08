/*
4. Java program to merge two files alternatively into third file 
*/

import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.*;
import java.io.IOException;

class Demo
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream in2  = null;
			FileInputStream in  = null;
			FileOutputStream out = null;
			Scanner sobj = new Scanner(System.in);

/*			System.out.println("Enter the data to write in first file");
			String str1 = sobj.nextLine();
			System.out.println("Enter the data to write in second file");
			String str2 = sobj.nextLine();
			fobj1.write(str1);
			fobj2.write(str2);
*/
			
			in = new FileInputStream("input1.txt");
			out = new FileOutputStream("file3.txt");

		 	in2 = new FileInputStream("input2.txt");

			int c;
			while((c = in.read()) != -1)
			{
				out.write(c);
			}
			while((c = in2.read()) != -1)
			{
				out.write(c);
			}
			
			in.close();
			out.close();
			in2.close();
		}
		catch(IOException io)
		{
			System.out.println("Unable to Create the File");
		}
	}
}