// BubbleSort.java
public class BubbleSort extends Sorts {
	private int[] bubble = new int[12];
	private String name;
	public BubbleSort() {
		bubble = super.array;
		name = "Bubble";
	}
	public void sort() {
		// TIMING : 0(n)
		// AVERAGE: 0(n^2)
		// WORST  : 0(n^2)
		System.out.println("Doing " + name + " Sort: ");
		boolean continueLoop;
		int count = 1;
		do {
			System.out.print("Step #" + count + " ");
			printArray();
			continueLoop = false;
			for(int i = 0; i < bubble.length-1; i++) {
				if(bubble[i] > bubble[i+1]) {
					super.swap(i, i+1);
					continueLoop = true;
				}
			}
			count++;
		} while(continueLoop);
	}
}