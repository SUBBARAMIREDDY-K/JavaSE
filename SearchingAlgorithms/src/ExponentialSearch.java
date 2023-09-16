
public class ExponentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,9,10};
		int target=3;
		var pos=ExponentialSearch(arr,target);
		System.out.println(pos);
	}
	static int ExponentialSearch(int arr[],int target)
	{
		int bound=1;
		while(bound<arr.length && arr[bound]<target)
		{
			bound *=2;														//Time Complexity O(log i)
		}
		int left=bound/2;
		int right=Math.min(arr.length-1, bound);
		return BinarySearchRecursive.BinarySearchRecursive(arr,target,left,right);
	}

}