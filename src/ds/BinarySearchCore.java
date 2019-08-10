package ds;

public class BinarySearchCore {

	public static int binarySearch(int a[], int key) {
		int low = 0;
		int high = a.length - 1;

		while (low < high) {
			int mid = (low + high) / 2;
			if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int a[] = { 2, 3, 6, 9, 10 };
		int key = 6;
		System.out.println(binarySearch(a, key));

	}

}
