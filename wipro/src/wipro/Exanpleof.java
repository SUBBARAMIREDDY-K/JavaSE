package wipro;

import java.util.HashMap;
import java.util.Scanner;

public class Exanpleof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1[] = new int[10];
		for(int i=0;i<10;i++)
		{
			input1[i]=sc.nextInt();
		}
		System.out.println();

	}
	public static int findPassword(int []input1,int input2)
	{
		String ans="";
		int part2=find(input1);
		
		
	}
	public static int find(int a[])
	{
		int a1[]=new int[251];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				a1[a[i]]++;
		}
		int mf=0;
		int max=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]>0)
			{
				if(max<=a1[i]) {
					max=a1[i];
					mf=i;
				}
			}
		}
		return mf;
	}

}
