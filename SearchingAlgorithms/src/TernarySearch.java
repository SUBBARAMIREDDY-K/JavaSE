
public class TernarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,9,10};
		int target=20;
		var pos=TernarySearchRecursive(arr,target,0,arr.length-1);
		System.out.println(pos);

	}
	static int TernarySearchRecursive(int arr[],int target,int left,int right)
	{
		if(left>right)
			return -1;
		int  partitionSize=(right-left)/3;
		var mid1=left+partitionSize;
		var mid2=right-partitionSize;
		if(arr[mid1]==target) return mid1;
		if(arr[mid2]==target) return mid2;
		if(arr[mid1]>target)
			return TernarySearchRecursive(arr,target,left,mid1-1);
		if(arr[mid2]<target)
			return TernarySearchRecursive(arr,target,mid2+1,right);
		return TernarySearchRecursive(arr,target,mid1+1,mid2-1);
		
	}

}
