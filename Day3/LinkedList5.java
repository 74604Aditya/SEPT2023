class LinkedList5
{
	Node head;

	static class Node{

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void diaplay()
	{
		Node n  = head;
		while(n != null)
		{
			System.out.print(n.data + "---> ");
			n = n.next;
		}
	}

	void insert( int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void append(int new_data)
	{
		Node new_node = new Node(int new_data);
		if(head == null)
		{
			head = new_node;
			return;
		}

		new_node.next = null;
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}

		last.next = new_node;
		return;
	}


