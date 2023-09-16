import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,3,2,2,1,4,5,3};
		int maxele=5;
		int[] counts=new int[maxele+1];
		for(int item:numbers)
			counts[item]++;
		int k=0;
		for(int i=0;i<counts.length;i++)
		{
			for(int j=0;j<counts[i];j++)
			{
				numbers[k++]=i;
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

}
