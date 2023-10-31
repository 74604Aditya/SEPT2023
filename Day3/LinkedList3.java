class LinkedList3
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
		LinkedList3 L3 = new LinkedList3();
		L3.head = new Node(5);
		Node Second = new Node(7);
		Node Third = new Node(11);

		L3.head.next = Second;
		Second.next = Third;

		L3.display();
		L3.insert(10);
		System.out.println();
		L3.display();

		L3.insert(20);
		System.out.println();
		L3.display();

		L3.insert(25);
		System.out.println();
		L3.display();

		L3.insert(30);
		System.out.println();
		L3.display();

	}
}

