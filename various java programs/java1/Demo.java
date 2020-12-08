import Marvellous.MarvellousArray;
import java.lang.*;
import java.util.*;

class Demo
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the size of array");
        int size = sobj.nextInt();

        MarvellousArray mobj = new MarvellousArray(size);

        mobj.Accept();
        mobj.Display();
    }
}