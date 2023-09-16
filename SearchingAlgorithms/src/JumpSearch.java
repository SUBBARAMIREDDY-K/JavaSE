
public class JumpSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,9,10,20,39,45};
		int target=7;
		var pos=JumpSearch(arr,target);
		System.out.println(pos);
	}
	static int JumpSearch(int arr[],int target)
	{
		
		int blocksize=(int)Math.sqrt(arr.length);
		int start=0;
		int next=blocksize;
		while(start<arr.length && arr[next-1]<target)
		{
			start=next;
			next+=blocksize;
			if(next>arr.length)
				next=arr.length;						//	TimeComplexity O(root N)
		}
		 for(int i=start;i<next;i++)
		 {
			 if(arr[i]==target)
				 return i;
		 }
		 return -1;
		
		
	}

}
