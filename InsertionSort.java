// InsertionSort.java
public class InsertionSort extends Sorts {
	private int[] insertion = new int[12];
	private String name;
	public InsertionSort() {
		insertion = super.array;
		name = "Insertion";
	}
	public void sort() {
		System.out.println("Doing " + name + " Sort: ");
		int itemToInsert, j;
		int count = 1;
		boolean keepLooping;
		// on nth pass, insert item n into correct position
		for(int n = 1; n < insertion.length; n++) {
			// go backwards through the list, look for the slot to insert n
			itemToInsert = insertion[n];
			j = n - 1;
			keepLooping = true;
			while((j >= 0) && keepLooping) {
				System.out.print("Step #" + count + " ");
				printArray();
				if(itemToInsert < insertion[j]) {
					insertion[j+1] = insertion[j];
					j--;
					if(j == -1) { // special case for inserting item at [0]
						insertion[0] = itemToInsert;
					}
				}
				else {
					keepLooping = false;
					insertion[j+1] = itemToInsert;
				}
				count++;
			}
		}
	}
}