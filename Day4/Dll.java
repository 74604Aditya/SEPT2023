public class Dll
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
		while(n  != null)
		{
			System.out.print(n.data+ " ---> ");
			n = n.next;
		}
	}

	void insert(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void append(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}

		newNode.next = null;
		Node last = head;

		while(last.next != null)
		{
			last = last.next;
		}
		last.next = newNode;
		return;
	}

	void insertAfter(Node prevNode, int data)
	{
		if(prevNode == null)
		{
			System.out.println("Empty list !!!");
			return;
		}

		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}


	void deleteNode(int key)
	{

		Node temp = head, prev = null;
		if(temp != null && temp.data == key)
		{
			head = temp.next;
			return;
		}

		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}

		if(temp == null)
		return;
		prev.next = temp.next;
	}

	void deletenode(int position)
	{
		if(head == null)
		{
			return;
		}

		Node temp = head;

		if(position == 0)
		{
			head = temp.next;
			return;
		}

		for(int i = 0 ; temp != null && i < position-1 ; i++)
		{
			temp = temp.next;
		}
		if(temp == null || temp.next == null)
		{
			return;
		}

		Node last = temp.next.next;
		temp.next = last;
	}

	public static void main(String args[])
	{
		Dll L1 = new Dll();
		L1.head = new Node(9);

		System.out.println("\n Insert Node : ");
		L1.display();
		L1.insert(7);
		System.out.println();


		System.out.println("\n Insert Node : ");
		L1.display();
                L1.insert(8);
                System.out.println();

		System.out.println("\n Insert Node : ");
		L1.display();
                L1.insert(6);
                System.out.println();

		System.out.println("\n Insert Node : ");
		L1.insert(15);
		System.out.println();
		L1.display();

		System.out.println("\n Insert Node : ");
		L1.append(23);
		System.out.println();
		L1.display();

		System.out.println("\n Append Node : ");
		L1.append(33);
                System.out.println();
                L1.display();

		System.out.println("\n Append Node : ");
		L1.append(43);
                System.out.println();
                L1.display();

		System.out.println("\n Insert Node at position : ");
		L1.insertAfter(L1.head.next, 53);
		System.out.println();
		L1.display();

		System.out.println("\n Delete Node : ");
		L1.deleteNode(53);
		System.out.println();
		L1.display();

		System.out.println("\n Delete Node at position : ");
		L1.deletenode(3);
		System.out.println();
		L1.display();

		System.out.println("\n");
	}
}	
