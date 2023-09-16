package wipro;
import java.util.*;
import java.util.Scanner;

public class EXampleProgram {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] input1=new int[n];
		for(int i=0;i<n;i++)
			input1[i]=sc.nextInt();
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i:input1)
		{
			if(!hs.containsKey(i))
				hs.put(i, 1);
			else
			{
				int value = hs.get(i);
				value+=1;
				hs.put(i, value);
			}
		}
		Iterator<Integer> it = hs.keySet().iterator();
		int maxk=Integer.MIN_VALUE;
		int maxe=Integer.MIN_VALUE;
		while(it.hasNext())
		{
			int key=it.next();
			if(maxk<key && maxe<hs.get(key))
			{
				maxk=key;
				maxe=hs.get(key);
			}
		}
		Iterator<Integer> it1 = hs.keySet().iterator();
		ArrayList<Integer> a= new ArrayList<Integer>();
		while(it1.hasNext())
		{
			int key=it1.next();
			int value=hs.get(key);
			if(value>1&&value<maxk)
				a.add(key);
			
		}
		Collections.sort(a);
		int m1=Collections.max(a);
		System.out.print(m1);
		int password=m1*maxk;
		System.out.println(maxk+" "+maxe);
		System.out.println(password);
		
		
		

	}

}
 