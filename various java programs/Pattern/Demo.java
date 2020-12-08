/* 
Prooblem Staement : Pattern printing 

*/

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int row,int col)
    {
        int i = 0,j = 0;
        int iCnt = 1;
        char ch = 'A';
        for(i = 1; i <= row ; i++)
        {
            for(j = 1; j <= col; j++)
            {
                if(i == j)
                {
                    System.out.print("&\t");
                }
                else if((i == 1)||(j == col)||(i == row)||(j == 1))
                {
                    System.out.print("*\t");
                }
                else if(i < j)
                {
                    System.out.print(iCnt+"\t");
                    iCnt++;
                }
                else
                {
                    System.out.print(ch+"\t");
                    ch++;
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
        int row = 0, col = 0;
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter number of rows");
        row = sobj.nextInt();
        
        System.out.println("Enter number of column");
        col = sobj.nextInt();
        
        Pattern pobj = new Pattern();

        pobj.Display(row, col);
    }

}




/*                      11      12      13      14      15      16

                        21      22      23      24      25      26

                        31      32      33      34      35      36

                        41      42      43      44      45      46

                        51      52      53      54      55      56

                        61      62      63      64      65      66