
public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,9,10};
		int target=9;
		var pos=BinarySearchRecursive(arr,target,0,arr.length-1);
		System.out.println(pos);

	}
	static int BinarySearchRecursive(int arr[],int target,int left,int right)
	{
		if(left>right) return -1;
		int middle=(left+right)/2;														//Time COmplexity O(log n)
																						//Space Complexity O(log n)
		if(arr[middle]==target) return middle;
		if(target>arr[middle])
			return BinarySearchRecursive(arr,target,middle+1,right);
		return BinarySearchRecursive(arr,target,left,middle-1);
	}

}
