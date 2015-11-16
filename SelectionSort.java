// SeletionSort.java
public class SelectionSort {
	public static void printArray(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length; i++) {
			if(i == a.length-1) {
				System.out.print(a[i]);
			}
			else {
				System.out.print(a[i] + ", ");
			}
		}
		System.out.print("]");
	} 
	public static void selectionSort(int[] a, int[] b) {
		printArray(a);
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i] < a[j]) {
					System.out.println(a[i] + " is smaller than " + a[j]);
					b.push(a[i]);
				}
			}
		}
		printArray(b);
	}
	public static void main(String args[]) {
		int[] ips = {76, 71, 63, 65, 66, 64, 70, 69, 68, 67, 72, 73};
		int[] ipsorted = new int[12];
		printArray(ips);
		System.out.println();
		selectionSort(ips, ipsorted);
		// Print the array EVERY step through the sort
		// Declare which STEP you're on
		// Tell me the FiINAL sorted array
	}
}