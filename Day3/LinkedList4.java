class LinkedList4
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
		while( n != null)
		{
			System.out.print(n.data + "----> ");
			n=n.next;
		}
	}

	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		
			if(head == null)
			{
			
				head = new_node;
				return;
			}
			
			new_node.next = null;
			Node last = head;
			
			while(last.next != null )
			{
				last = last.next;
			}
			
			last.next = new_node;
			return;
	}

	public static void main(String args[])
	{
		LinkedList4 L4 = new LinkedList4();
		L4.head = new Node(2);

		L4.display();
		L4.insert(4);
		System.out.println();


		 L4.display();
                L4.insert(6);
                System.out.println();

		 L4.display();
                L4.insert(8);
                System.out.println();

		 L4.display();
                L4.insert(10);
                System.out.println();

		 L4.display();
                L4.append(12);
                System.out.println();

		 L4.display();
                L4.append(14);
                System.out.println();

		 L4.display();
                L4.append(16);
                System.out.println();
	}
}	
