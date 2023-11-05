public class Dll1
{
	Node head;

	static class Node
	{
		int data;
		Node next,prev;
		
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
			head = newNode;
		}
	}

	void display(Node n)
	{
		Node p = null;
		System.out.println("Forward Direction : ");
		while(n != null)
		{
			System.out.println(n.data+"---> ");
			p = n;
			n = n.next;
		}

		System.out.println("Backward Direction : ");

		while(p != null)
		{
			System.out.println(p.data+"---> ");
			p = p.prev;
		}
	}

	public static void main(String args[])
	{
		Dll1 d1 = new Dll1();
		d1.display(d1.head);
		System.out.println("--------------------------");


		System.out.println("\n");
		d1.insert(10);
		d1.display(d1.head);

		System.out.println("\n");
		d1.insert(5);
		d1.display(d1.head);
	}
}
