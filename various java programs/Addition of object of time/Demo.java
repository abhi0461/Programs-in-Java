// 1. Java program to add two time class objects. 

import java.lang.*;
import java.util.*;
import java.io.*;


class Time
{
	public int hr;
	public int min;
	public int sec; 
	
	public Time(int value1, int value2, int value3)
	{
		hr = value1;
		min = value2;
		sec = value3; 
	}
	public Time()
	{}
	public static void AddTime(Time obj1, Time obj2)
	{
		int quosec = (obj1.sec+obj2.sec)/60;
		int remsec = (obj1.sec+obj2.sec)%60;

		int newsec = remsec;
		int newmin = (obj1.min+obj2.min)+quosec;

		int quomin = newmin/60;
		int remmin = newmin%60;

		newmin = remmin;

		int newhr = (obj1.hr+obj2.hr)+quomin;

		System.out.println("Total time is : ");

		System.out.println("Hours : "+newhr);
		System.out.println("Minutes : "+newmin);
		System.out.println("Seconds : "+newsec);
	}
}

class Demo
{
	public static void main(String[] args)throws Exception 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the hours : ");
		int hr = sobj.nextInt();
		System.out.print("Enter the minutes : ");
		int min = sobj.nextInt();
		System.out.print("Enter the seconds : ");
		int sec = sobj.nextInt();

		System.out.print("Enter the hours : ");
		int hr1 = sobj.nextInt();
		System.out.print("Enter the minutes : ");
		int min1 = sobj.nextInt();
		System.out.print("Enter the seconds : ");
		int sec1 = sobj.nextInt();

		Time tobj1 = new Time(hr,min,sec);
		Time tobj2 = new Time(hr1,min1,sec1);
		Time tobj = new Time();
		tobj.AddTime(tobj1,tobj2);


	}
}