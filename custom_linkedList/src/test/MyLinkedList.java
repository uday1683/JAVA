package test;



public class MyLinkedList 
{
	private Node head,tail;
	private int size;
	
	public MyLinkedList()
	{
		head = tail = null;
		size=0;
	}
	 
	
	private class Node
	{
		int item;
		Node next; //next -> ANN(Address of next node)
		
		public Node(int item)
		{
			this.item=item;
			next= null;
		}
		
	}
	
	
	//adding an element
	public void add(int item)
	{
		Node newNode= new Node(item);
		if(head == null)
		{
			head= tail= newNode;
			return;
		}
		else
		{
			 tail.next= newNode;
			 tail= newNode;
		}
		size++;
	}
	
	// remove an element from the first 
	public void removeFirst()
	{
		if(head== null)
		{
			System.out.println("LinkedList is empty");
			return;
		}
		else
		{
			head= head.next;
			size--;
		}
	}
	
	
	//Displaying the elements
	public void display()
	{
		Node temp=head;
		while(temp !=null)
		{
			System.out.println(temp.item+" ");
			temp=temp.next;
		}
		
	}
	
	public static void main(String[] args) 
	{
		MyLinkedList list= new MyLinkedList();	
		list.add(100);
		list.add(200);
		list.add(300);
		
		
		System.out.println("Display LinkedList: ");
		list.display();
		
		System.out.println("Removing the First Element: ");
		list.removeFirst();
		

		System.out.println("Display LinkedList: ");
		list.display();
	}
}
