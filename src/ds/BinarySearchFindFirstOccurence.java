package ds;

class BinarySearchFindFirstOccurence
{
	public static int findFirstOccurrence(int[] a, int key)
	{
		int low = 0;
		int high = a.length - 1;
		int result = -1;

		while (low <= high)
		{ 
			int mid = (low + high) / 2;

			if (key == a[mid]) {
				result = mid;
				high = mid - 1;
			}
			else if (key < a[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		int a[] = { 2,6,6, 6, 9, 10 };
		int key = 6;
		System.out.println(findFirstOccurrence(a, key));
	}
}