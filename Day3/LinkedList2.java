class LinkedList2
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
			System.out.print(n.data + "---> ");
			n = n.next;
		}
	}

	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
	       head = new_node;
	}

	public static void main(String args[])
	{
		LinkedList2 L2 = new LinkedList2();
		L2.head = new Node(5);
		Node Second = new Node(7);
		Node Third = new Node(11);

		L2.head.next = Second;
		Second.next = Third;

		L2.display();
		L2.insert(10);
		System.out.println();
		L2.display();

		L2.insert(20);
		System.out.println();
		L2.display();
	}
}

