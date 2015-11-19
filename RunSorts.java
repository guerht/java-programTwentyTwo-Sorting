/*
 * Project: RunSorts.java
 * Description: Running various sorting methods on the same array
 * Author: Seunghoon Park
 * Date: 17 November, 2015
 */
public class RunSorts {
	public static void main(String args[]) {
		// Bubble Sort
		BubbleSort b = new BubbleSort();
		System.out.println("Unsorted: " + b);
		b.sort();
		System.out.println("Sorted: " + b + "\n");
		// Selection Sort
		SelectionSort s = new SelectionSort();
		System.out.println("Unsorted: " + s);
		s.sort();
		System.out.println("SORTED: " + s + "\n");
		// Insertion Sort
		InsertionSort s = new InsertionSort();
		System.out.println("Unsorted: " + i);
		i.sort();
		System.out.println("SORTED: " + i + "\n");
		// Quick Sort
		// Merge Sort
		// Radix Sort (?)
	}
}