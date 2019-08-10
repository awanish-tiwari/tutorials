package ds;

public class BinarySearchCeiling {

	public static int binarySearch(int a[], int key) {
		int low = 0;
		int high = a.length - 1;

		 for(int i = low; i < high; i++) 
	      { 
	        if(a[i] == key) 
	          return i; 
	        
	        if(a[i] < key && a[i+1] >= key) 
	           return i+1; 
	      }          
	        
	      return -1; 
	}

	public static void main(String args[]) {
		int a[] = { 2, 3, 6, 9, 10 };
		int key = 7;
		System.out.println(binarySearch(a, key));
	}

}
