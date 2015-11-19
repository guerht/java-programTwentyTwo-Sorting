// SeletionSort.java
public class SelectionSort extends Sorts {
	private int[] selection = new int[12];
	private String name;
	public SelectionSort() {
		selection = super.array;
		name = "Selection";
	}
	public void sort() {
		System.out.println("Doing " + name + " Sort: ");
		int count = 1;
		int minValue, minIndex;
		for(int i = 0; i < selection.length; ++i) {
			System.out.print("Step # " + count);
			printArray();
			// temp value to remember the lowest # and its index
			minValue = selection[i];
			minIndex = i;
			for(int j = i + 1; j < selection.length; ++j) {
				System.out.print("Step # " + count);
				printArray();
				// resets the lowest # and index in the TEMP values
				if(selection[j] < minValue) {
					minValue = selection[j];
					minIndex = j;
				}
				count++;
			}
			// reset the ACTUAL array values in the sorted order if necessary
			selection[minIndex] = selection[i];
			selection[i] = minValue;
			count++;
		}
	}
}