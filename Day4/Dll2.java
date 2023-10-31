class Dll2
{
	Node head;

	static class Node
	{
		int data;
		Node prev,next;


		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}	
	}

	void insert(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev = null;

		if(head != null)
		{
			head.prev = newNode;
		}
		
		head = newNode;
	}

	void append(int data)
	{
		Node newNode = new Node(data);
		Node last = head;
		newNode.next = null;

		if(head == null)
		{
			newNode.prev = null;
			head = newNode;
		       return;	       
		}

		while(last.next != null)
		{
			last = last.next;
		}

		last.next = newNode;
		newNode.prev = last;
	}

	void insertAfter(Node prevNode, int data)
	{
		if(prevNode == null)
		{
			System.out.println("Node cannot be exist.");
			return;
		}

		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if(newNode.next != null)
		{
			newNode.next.prev = newNode;
		}
	}

	void display(Node n)
	{
		Node p = null;
		System.out.println("Forward Dir: ");

		while(n != null)
		{
			System.out.print(n.data+ "---> ");
			p = n;
			n = n.next;
		}

		System.out.println("---------------------------------");
		System.out.println();

		System.out.println("Backward Dir: ");

		while(p != null)
		{
			System.out.print(p.data+ "---> ");
			p = p.prev;
		}

	}

	public static void main(String args[])
	{
		
		Dll2 d1 = new Dll2();
		//d1.display(d1.head);
		System.out.println("------------------------------**");
		
		d1.insert(10);
		//d1.display(d1.head);
		
		
		System.out.println();
		
		d1.insert(5);
		//d1.display(d1.head);
		
		System.out.println();
		d1.append(23);
		//d1.display(d1.head);
		
		System.out.println();
		d1.append(33);
		//d1.display(d1.head);
		
		System.out.println();
		d1.append(28);
		d1.display(d1.head);
		
		System.out.println();
		d1.insertAfter(d1.head.next, 45);
		d1.display(d1.head);
		
		System.out.println();
		d1.insertAfter(d1.head.next.next, 55);
		d1.display(d1.head);
	}
}


