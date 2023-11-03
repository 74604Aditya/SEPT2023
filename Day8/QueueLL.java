class QueueLL
{
	QNode front, rear;

	static class QNode
	{
		int key;
		QNode next;

		public QNode(int key)
		{
			this.key = key;
			this.next = null;
		}
	}

	public QueueLL()
	{
		this.front = this.rear = null;
	}

	void enqueue(int key)
	{
		QNode temp = new QNode(key);

		if(this.rear == null)
		{
			this.front = this.rear = temp;
		       return;
		}	       
		
		this.rear.next = temp;
		this.rear = temp;
	}

	void dequeue()
	{
		if(this.front == null)
		{
			return;
		}

		QNode temp = this.front;
	       this.front = this.front.next;

	       if(this.front == null )
	       {
		       this.rear = null;
	       }
	}

	public static void main(String args[])
	{
		QueueLL q = new QueueLL();
		q.enqueue(10);
		q.enqueue(20);

		q.dequeue();
		q.dequeue();

		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		q.dequeue();

		if(q.front != null){
			System.out.println("Queue Front : " + q.front.key);
		}else{
			System.out.println("Queue is empty.");
		}

		if(q.rear != null ){
			System.out.println("Queue Rear = " + q.rear.key);
		}else{
			System.out.println("Queue is empty.");
		}
	}
}
