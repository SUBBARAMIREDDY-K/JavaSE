
public class PriortyQueueHeap {
	private Heap heap = new Heap();
	public void enqueue(int item) {
		heap.insert(item);
	} 
	public int dequeue() {
		return heap.remove();
	}
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	/*
	 * priorityQueue without using heap for insert=>O(n) delete=>O(1)
	 * Heap -- insert=>O(log n) delete O(log n)
	 * 
	 * */

}
