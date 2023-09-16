package wipro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sumOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList input1 = new ArrayList();
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			input1.add(sc.nextInt());
		}
		HashMap<Integer,Integer> hs1= new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hs2= new HashMap<Integer,Integer>();
		for(int i=0;i<input1.size();i++)
		{
			if(!hs1.containsKey(input1.get(i)) && bool(input1.get(i)))
			{
				
			}
		}
		
	}

	private static boolean bool(Object object) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
