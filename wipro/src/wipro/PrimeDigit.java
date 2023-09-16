package wipro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1=sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(input1!=0)
		{
			list.add(input1%10);
			input1/=10;
		}
		Collections.reverse(list);
		int count=0;
		boolean prime=true;
		for(int x:list)
		{
			prime=0;
			for(int i=2;i<=x;i++)
			{
				if(x%i==0)
					prime++;
			}
			if(prime==1)
				count++;
		}
		return count;
			
		
		

	}

}
