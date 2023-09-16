package wipro;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		TreeMap<Character,Integer> ts = new TreeMap<>(Comparator.reverseOrder());
		for(int i=0;i<s1.length();i++)
		{
			if(!ts.containsKey(s1.charAt(i)))
				ts.put(s1.charAt(i), 1);
		}
		for(int i=0;i<s2.length();i++)
		{
			if(!ts.containsKey(s2.charAt(i)))
				ts.put(s2.charAt(i), 1);
		}
		Iterator it = ts.keySet().iterator();
		String s="";
		while(it.hasNext())
		{
			
			s+=it.next();
			
		}
		
		System.out.println(s);

	}

}
