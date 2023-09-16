import java.util.Scanner;

public class LinearSearch {

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
		int position=LinearSearch(arr,target);
		System.out.println(position);

	}
	static int LinearSearch(int arr[],int target)
	{
		for(var i=0;i<arr.length;i++)
			if(arr[i]==target)
				return i;
		return -1;
	}

}
