package wipro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		ArrayList<Integer> l1= new ArrayList<Integer>();
		l1.add(input1);
		l1.add(input2);
		l1.add(input3);
		ArrayList<Integer> l2= new ArrayList<Integer>();
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int ele:l1)
		{
			while(ele!=0)
			{
				int digit=ele%10;
				l2.add(digit);
				hs.put(digit, hs.getOrDefault(digit, 0)+1);
				ele/=10;
			}
		}
		int maxf=maxFrequency(hs);
		int minf=minFrequency(hs);
		int max1=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		Iterator<Integer> it =hs.keySet().iterator();
		while(it.hasNext())
		{
			int key=it.next();
			int ele=hs.get(key);
			if(ele==maxf)
			{
				if(key>max1)
					max1=key;
			}
			if(ele==minf)
			{
				if(key<min)
					min=key;
			}	
		}
		int m1=Collections.max(l2);
		int m2=Collections.min(l2);
		int pin=max1*1000+min*100+m1*10+m2;
		System.out.print(pin);
	}
	public static int maxFrequency(HashMap<Integer,Integer> hs)
	{
		int max=Integer.MIN_VALUE;
		Iterator<Integer> it =hs.keySet().iterator();
		while(it.hasNext())
		{
			int key=it.next();
			if(hs.get(key)>max)
				max=hs.get(key);
		}
		return max;
	}
	public static int minFrequency(HashMap<Integer,Integer> hs)
	{
		int min=Integer.MAX_VALUE;
		Iterator<Integer> it =hs.keySet().iterator();
		while(it.hasNext())
		{
			int key=it.next();
			if(hs.get(key)<min)
				min=hs.get(key);
		}
		return min;
	}

}
