class CQueue
{
	int size = 5;
	int CQ[] = new int[size];
	int rear,front;

	CQueue()
	{
		front = -1;
		rear = -1;
	}

	boolean isFull()
	{
		if(front == 0 && rear == size-1)
		{
			return true;
		}else{
			if(front == rear+1)
			{
				return true;
			}else{
				return false;
			}
		}
	}


	boolean isEmpty()
	{
		if(front == -1)
		{
			return true;
		}else{
			return false;
		}
	}

	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}else{
			
			if(front == -1)
			{
				front = 0;
			}
			
			rear = (rear+1)%size;
			CQ[rear] = x;
			System.out.println(x+ "Inserted.");
		}
	}

	int dequeue()
	{
		int x;
		if(isEmpty())
		{
			System.out.println("Queue is empty.");
			return -1;
		}else{
			x = CQ[front];
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}else{
				front = (front+1) % size;
			}
			
			System.out.println(x + "Deleted.");
			return x;
		}
	}

	void display()
	{
		int i;
		if(isEmpty())
		{
			System.out.println("Empty queue.");
		}else{
			for(i = front; i != rear; i = (i+1) % size)
			{
				System.out.println(CQ[i] + " ");
			}

			System.out.println(CQ[i]);
		}
	}

	public static void main(String args[])
	{
		CQueue q1 = new CQueue();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.enqueue(15);
		q1.enqueue(16);

		q1.display();
		q1.dequeue();
		q1.display();
		q1.enqueue(16);
		q1.display();
	}
}
