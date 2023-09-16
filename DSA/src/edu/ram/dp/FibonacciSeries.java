package edu.ram.dp;

import java.util.Scanner;

public class FibonacciSeries {

	static int arr[]= {-1,-1,-1,-1,-1,-1};
	static int fib[] = new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
		System.out.println(fibonacciMemorization(n));
		System.out.println(fibonacciTabulation(n));

	}
	public static int fibonacci(int n)
	{
		//Exponentila TIme Complexity
		if(n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public static int fibonacciMemorization(int n)
	{
		//Fibonnacci Series in Linear Time Complexity
		if(arr[n]==-1)
		{
			int res;
			if(n<=1)
				res=n;
			else
				res = fibonacciMemorization(n-1)+fibonacciMemorization(n-2);
			arr[n]=res;
		}
		return arr[n];
	}
	public int fibonacciTabulation(int n)
	{
		
		int fib[0]=0;
		int fib[1]=1;
		for(int i=2;i<=n;i++)
		{
			fib[i]=fib[i-1]+fib[n-2];
		}
		return fib[n];
	}
}
