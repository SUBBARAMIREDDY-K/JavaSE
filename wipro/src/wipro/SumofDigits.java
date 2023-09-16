package wipro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String s=Integer.toString(a);
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				int num=Character.getNumericValue(s.charAt(j));
				sum+=num;
			}
		}
		System.out.println(sum);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp=a;
		while(temp!=0)
		{
			list.add(temp%10);
			temp/=10;
		}
		int s1=0;
		Collections.reverse(list);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i;j<list.size();j++)
			{
				s1+=list.get(j);
			}
		}
		System.out.println(s1);

	}

}
