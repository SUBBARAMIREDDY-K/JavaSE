import java.util.Scanner;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		System.out.println("Enter the Size of array : ");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of array : ");
		for(var i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the target Element : ");
		var target=sc.nextInt();
		int position=LinearSearchRecursive(arr,target,arr.length-1);
		System.out.println(position);
	}
	static int LinearSearchRecursive(int arr[],int target,int index)
	{
		if(index<0)
			return -1;
		if(arr[index]==target)
			return index;
		return LinearSearchRecursive(arr,target,--index);
	}

}
