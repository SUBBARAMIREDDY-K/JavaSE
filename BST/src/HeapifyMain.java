import java.util.Arrays;

public class HeapifyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,3,8,4,1,10};
		Heapify.heapify(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Heapify.getKthLargest(numbers, 7));

	}

}
