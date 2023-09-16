package wipro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exampleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		ArrayList<Integer> l1= new ArrayList<Integer>();
		ArrayList<Integer> l2= new ArrayList<Integer>();
		ArrayList<Integer> l3= new ArrayList<Integer>();
		ArrayList<Integer> l4= new ArrayList<Integer>();
		HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
		int c=4;
		while(input1!=0)
		{
			int digit=input1%10;
			if(hs.containsKey(digit))
			{
				int a=hs.get(digit);
				a+=1;
				hs.put(digit, a);
			}
			else
			{
				hs.put(digit, 1);
			}
			input1/=10;
		}
		while(input2!=0)
		{
			int digit=input2%10;
			if(hs.containsKey(digit))
			{
				int a=hs.get(digit);
				a+=1;
				hs.put(digit, a);
			}
			else
			{
				hs.put(digit, 1);
			}
			input2/=10;
		}
		while(input3!=0)
		{
			int digit=input3%10;
			if(hs.containsKey(digit))
			{
				int a=hs.get(digit);
				a+=1;
				hs.put(digit, a);
			}
			else
			{
				hs.put(digit, 1);
			}
			input3/=10;
		}
		int max=0;
		Iterator it = hs.keySet().iterator();
		while(it.hasNext())
		{
			int value=(int)it.next();
			if(max<hs.get(value))
				max=hs.get(value);
		}
		Iterator it1 = hs.keySet().iterator();
		while(it1.hasNext())
		{
			if(max)
		}
		
		
		

	}

}
