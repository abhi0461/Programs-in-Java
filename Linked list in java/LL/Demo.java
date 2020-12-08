
import java.lang.*;
import java.util.*;

class Node
{
	public int data;
	public Node next;

	public Node(int value)
	{
		data = value;
		next = null;
	} 
}

class SinglyLinkedList
{
    public Node Head;

    public SinglyLinkedList()
    {
    	Head = null;
    }

    public void InsertFirst(int no)
    {
    	Node newn = new Node(no);
    	if(Head == null)
    	{
    		Head = newn;
    	}
    	else
    	{
    		newn.next = Head;
    		Head = newn;
    	}

    }

    public void InsertLast(int no)
    {
    	Node newn = new Node(no);
    	Node temp = Head;

    	if(Head == null)
    	{
    		Head = newn;
    	}

    	while(temp.next != null)
    	{
    		temp = temp.next;
    	}
    	temp.next = newn;
    }

    public void Display()
    {
    	Node temp = Head;
    	while(temp != null)
    	{
    		System.out.print("|"+temp.data+"|");
    		temp = temp.next;
    	}
    	System.out.println();
    }

    public int Count()
    {
    	int icnt = 0;
    	Node temp = Head;

    	while(temp != null)
    	{
    		temp = temp.next;
    		icnt++;
    	}
    	return icnt;
    }

    public void DeleteFirst()
    {
    	Node temp = Head;

    	if(Head != null)
    	{
    		Head = Head.next;
    	}
    }

    public void DeleteLast()
    {
    	if(Head == null)
    	{
    		return;
    	}

    	else
    	{
    	 	if(Head.next == null)			    	
	    	{
	    		Head = null;
	    	}
	    	else
	    	{
	    		Node temp = Head;

	    		while(temp.next.next != null)
	    		{
	    			temp = temp.next;
	    		}
	    		temp.next = null;
	    	}
    	}
    }

    public void InsertAtPos(int no,int pos)
    {
    	int size = Count();
    	
	    if((pos < 1) || (pos > (size + 1)))       // Invalid Position
	    {
	        return;
	    }
	    else if(pos == 1)        // First position
	    {
	        InsertFirst(no);
	    }
	    else if(pos == size + 1)    // Last position
	    {
	        InsertLast(no);
	    }
	    else
	    {
	    	Node temp = Head;
	    	Node newn = new Node(no);

	        for(int i = 1; i< pos-1; i++)
	        {
	            temp = temp.next;
	        }
	        
	        newn.next = temp.next;
	        temp.next = newn;
	    }
    }

    public void DeleteAtPos(int pos)
    {
    	int size = Count();
    	
	    if((pos < 1) || (pos > size))       // Invalid Position
	    {
	        return;
	    }
	    else if(pos == 1)        // First position
	    {
	        DeleteFirst();
	    }
	    else if(pos == size)    // Last position
	    {
	        DeleteLast();
	    }
	    else
	    {
	    	Node temp = Head;
	    	Node temp2;
	    
        for(int i = 1; i< pos-1; i++)
        {
            temp = temp.next;
        }
        temp2 = temp.next;
        temp.next = temp2.next;
        temp2 = null;
    }
    }
}

class Demo
{
	public static void main(String args[])
	{
		int pos = 0;
		System.out.println("Inside main");
		Scanner sobj = new Scanner(System.in);
		SinglyLinkedList obj = new SinglyLinkedList();

		obj.InsertFirst(51);
		obj.InsertFirst(21);
		obj.InsertFirst(11);
		obj.Display();
		System.out.println("Number of nodes are : "+obj.Count());

		obj.InsertLast(101);
		obj.InsertLast(111);
		System.out.println("Number of nodes are : "+obj.Count());
		obj.Display();

		obj.DeleteFirst();
		obj.Display();

		obj.DeleteLast();
		obj.Display();

		System.out.println("Enter the position at which you want to insert the node");
		pos = sobj.nextInt();
		obj.InsertAtPos(150,pos);
		obj.Display();
		System.out.println("Number of nodes are : "+obj.Count());

		System.out.println("Enter the position at which you want to delete the node");
		pos = sobj.nextInt();
		obj.DeleteAtPos(pos);
		obj.Display();
		System.out.println("Number of nodes are : "+obj.Count());

	}
}