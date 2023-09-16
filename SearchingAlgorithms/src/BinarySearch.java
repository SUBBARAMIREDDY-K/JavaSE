
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,9,10};
		int target=9;
		var pos=BinarySearch(arr,target);
		System.out.println(pos);

	}
	static int BinarySearch(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int middle=-1;
		while(left<right)
		{
			middle=(left+right)/2;														//Time COmplexity O(log n)
			if(arr[middle]==target)														//Space Complexity O(1)
				return middle;
			if(target>arr[middle])
				left=middle+1;
			else
				right=middle-1;	
		}
		return -1;
	}

}
