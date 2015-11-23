// MergeSort.java
public class MergeSort extends Sorts {
	private int[] merge = new int[12];
	private String name;
	private int left;
	private int right;
	private int count;
	public MergeSort() {
		merge = super.array;
		name = "Merge";
		left = 0;
		right = merge.length-1;
		count = 1;
	}
	// consistst of empty sort() method, recursive sort(left, right) method, and merge(left, middle, right) method
	public void sort() {
		System.out.println("Doing " + name + " Sort: ");
		sort(left, right);
	}
	public void sort(int left, int right) {
		if(right == left) {
			return;
		}
		int middle = (left + right)/2;
		sort(left, middle);
		sort(middle + 1, right);
		merge(left, middle, right);

	}
	public void merge(int left, int middle, int right) {
		int temp[] = new int[right-left+1];
		int index1 = left;
		int index2 = middle + 1;
		int index = 0;
		while(index1 <= middle && index2 <= right) {
			if(merge[index1] < merge[index2]) {
				temp[index] = merge[index1];
				index1++;
			}
			else {
				temp[index] = merge[index2];
				index2++;
			}
			index++;
		}
		while(index1 <= middle) {
			temp[index] = merge[index1];
			index1++;
			index++;
		}
		while(index2 <= right) {
			temp[index] = merge[index2];
			index2++;
			index++;
		}
		for(index = 0; index < temp.length; index++) {
			System.out.print("Step #" + count + " ");
			printArray();
			merge[left + index] = temp[index];
			count++;
		}
	}
}