class LinkedList1
{
	Node head;

	static class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data+ "---> ");
			n=n.next;
		}
	}

	public static void main(String args[])
	{
		LinkedList1  L1 = new LinkedList1();
		L1.head = new Node(5);
		Node second = new Node(8);
		Node third = new Node(10);
		
		L1.head.next = second;
		second.next = third;

		L1.display();

	}
}	
