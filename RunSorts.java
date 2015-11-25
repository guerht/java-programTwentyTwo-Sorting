/*
 * Project: RunSorts.java
 * Description: Running various sorting methods on the same array
 * Author: Seunghoon Park
 * Date: 17 November, 2015
 */
public class RunSorts {
	public static void main(String args[]) {
		// Bubble Sort (66 steps)
		BubbleSort b = new BubbleSort();
		System.out.println("Unsorted: " + b);
		// b.sort();
		System.out.println("Sorted: " + b + "\n");
		// Selection Sort (78 steps)
		SelectionSort s = new SelectionSort();
		System.out.println("Unsorted: " + s);
		// s.sort();
		System.out.println("SORTED: " + s + "\n");
		// Insertion Sort (36 steps)
		InsertionSort i = new InsertionSort();
		System.out.println("Unsorted: " + i);
		// i.sort();
		System.out.println("SORTED: " + i + "\n");
		// Quick Sort (14 steps)
		QuickSort q = new QuickSort();
		System.out.println("Unsorted: " + q);
		// q.sort();
		System.out.println("SORTED: " + q + "\n");
		// Merge Sort (44 steps)
		MergeSort m = new MergeSort();
		System.out.println("Unsorted: " + m);
		m.sort();
		System.out.println("\nDoing Linear Search: ");
		System.out.println("Index of 69: " + m.linearSearch(69));
		System.out.println("\nDoing Binary Search: ");
		System.out.println("Index of 65: " + m.binarySearch(65));
		// System.out.println("SORTED: " + m + "\n");
		// Radix Sort (?)
	}
}