class HSort
{
	
	void heapify(int arr[], int n, int i) 
	{
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] > arr[largest]) 
		{
			largest = l;
	       	}
		
		if (r < n && arr[r] > arr[largest]) 
		{
			largest = r;
		}
		
		if (largest != i)
	       	{
			
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}

	void heapsort(int arr[])
	{
		int n = arr.length;

		for(int i = n / 2 - 1; i >= 0; i--)
		{
			heapify(arr, n, i);
		}

		for(int i = n - 1; i > 0; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	void display(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		HSort h1 = new HSort();
		int arr[] = {20, 60, 30, 10, 80, 100, 40, 70, 90, 50};
		System.out.println("Unsorted Array");
		h1.display(arr);
		h1.heapsort(arr);
		System.out.println("Sorted Array");
		h1.display(arr);
	}
}