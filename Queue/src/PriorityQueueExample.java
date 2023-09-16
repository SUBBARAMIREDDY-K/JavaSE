import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p= new PriorityQueue();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Integer  arr[] = new Integer[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(Integer i:arr)
		{
			p.add(i);
		}
		System.out.println(p);
	}

}
