package ds;

public class BinarySearchLastOccurence 
{
	public static int findLastOccurrence(int[] a, int key)
	{
		int low = 0;
		int high = a.length - 1;
		int result = -1;

		while (low <= high)
		{ 
			int mid = (low + high) / 2;

			if (key == a[mid]) {
				result = mid;
				low = mid + 1;
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
		int key = 9;
		System.out.println(findLastOccurrence(a, key));
	}
}