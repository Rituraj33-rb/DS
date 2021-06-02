package linklist;

public class LihnkedList {
Node head;
public void insert(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null)
	{
		head=node;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
}
public void insertAtstart(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	node.next=head;
	head=node;
}
public void insert(int index,int data)
{

	Node node=new Node();
	node.data=data;
	node.next=null;
	if(index==0)
	{
		insertAtstart( data);
	}
	else
	{
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
}
public void deleteAt(int index)
{
	if( index==0)
	{
		head=head.next;
	}
	else
	{
		Node n=head;
		Node temp=null;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		temp=n.next;
		n.next=temp.next;
		temp=null;
	}
}
public void show()
{
	Node node=head;
	while(node!=null)
	{
		System.out.println(node.data);
		node=node.next;
	}
}
}
