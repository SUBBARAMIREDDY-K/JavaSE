package edu.arrayWithRam;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOConsectiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = sc.nextInt();
		System.out.print("ENter the Consective Size : ");
		int k =sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		int max1=Integer.MIN_VALUE;
		int sum1=0;
		// Brutee Force Approach
		for(int i=0;i+k-1<n;i++)
		{
			sum1=0;
			for(int j=i;j<i+k;j++)
			{
				sum1+=arr.get(j);
			}
			if(sum1>max1)
			{
				max1=sum1;
			}
		}
		System.out.println("Maximum Sum is : "+max1);
		//Sliding Window Approach
		
		int max2=Integer.MIN_VALUE;
		int sum2=0;
		for(int i=0;i<k;i++)
		{
			sum2+=arr.get(i);
		}
		max2=sum2;
		for(int i=k;i<n;i++)
		{
			sum2+=arr.get(i)-arr.get(i-k);
			if(sum2>max2)
				max2=sum2;
		}
		System.out.println("Maximum Sum is :"+max2);
		
		

	}

}
