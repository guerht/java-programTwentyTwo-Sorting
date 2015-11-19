// InsertionSort.java
// BubbleSort.java
public class InsertionSort extends Sorts {
	private int[] insertion = new int[12];
	private String name;
	public InsertionSort() {
		insertion = super.array;
		name = "Insertion";
	}
	public void sort() {
		int itemToInsert, j;
		boolean keepLooping;
		// on nth pass, insert item n into correct position
		for(int n = 1; n < insertion.length; n++) {
			// go backwards through the list, look for the slot to insert n
			itemToInsert = insertion[n];
			j = k - 1;
			keepLooping = true;
			while((j >= 0) && keepLooping) {
				// checkpoint
			}
		}
	}
}