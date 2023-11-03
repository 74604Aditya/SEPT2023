class Bsearch
{
	static int search(int arr[], int x,int l, int r)
	{
		if(r >= 1)
		{
			int mid = l+(r-1)/2;

			if(arr[mid] == x)
			{
				return mid;
			}
			if(arr[mid] > x) 
			{
				return search(arr, x, mid+1, r);
			}
			return search(arr, x, mid+1, r);
		}
		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = {2, 31, 45, 67, 74, 78, 89};
		int x = 45;
		int n = arr.length;
		int result = search(arr, x, 0, n-1);

		if(result == -1)
		{
			System.out.println("Not Found");
		}else{
			System.out.println("Found !" + result);
		}
	}
}

