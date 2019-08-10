package ds;

public class BinarySearchBadVersion {

	public static boolean isBad(int a[]) {
		boolean result = false;
		int low = 0;
		int high = a.length - 1;

		for (int i = low; i < high; i++) {
			if (a[i] > a[i+1]) {
				result =  true;
				break;
			}
		}
		return result;
	}

	public static void main(String args[]) {
		int a[] = { 2, 3, 6, 9, 10 };
		System.out.println(isBad(a));
	}

}
