package LinkedList;

public class Basic 
{
	public static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args)
	{
		Node a=new Node(5);
		Node b=new Node(6);
		Node c=new Node(7);
		Node d=new Node(8);
		Node e=new Node(9);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		Node temp=a;
		
		// if We know number of nodes
//		for(int i=1;i<=5;i++)
//		{
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
		
		// if we don't know number of nodes
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		
	}

}
