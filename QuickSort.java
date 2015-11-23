// QuickSort.java
public class QuickSort extends Sorts {
	private int[] quick = new int[12];
	private String name;
	private int left;
	private int right;
	private int count;
	public QuickSort() {
		quick = super.array;
		name = "Quick";
		left = 0;
		right = quick.length-1;
		count = 1;
	}
	public void sort() {
		System.out.println("Doing " + name + " Sort: ");
		sort(left, right);
	}
	public void sort(int left, int right) {
		if(left >= right) {
			return;
		}
		int k = left;
		int j = right;
		int pivot = quick[(left + right) / 2];
		while(k < j) {
			while(quick[k] < pivot) {
				k++;
			}
			while(quick[j] > pivot) {
				j--;
			}
			if(k <= j) {
				System.out.print("Step #" + count + " ");
				printArray();
				swap(k, j);
				k++;
				j--;
				count++;
			}
		}
		sort(left, j); // left side
		sort(k, right); // right side
	}
}