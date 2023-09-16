package wipro;

import java.util.ArrayList;
import java.util.Scanner;

public class TransformCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n1;i++)
			arr.add(sc.nextInt());
		ArrayList<String> output=new ArrayList<String>();
		System.out.println(arr.size());
		for(int x:arr)
		{
			int n=x;
			String answer="";
			String s=Integer.toString(x);
			if(s.length()==6)
				answer+="C";
			else
				answer+="W";
			if(n==0)
				answer+="Z";
			else if(n==1)
				answer+="O";
			else
			{
				int prime=0;
				for(int i=2;i<=n;i++)
				{
					if(n%i==0)
						prime++;
				}
				if(prime==1)
					answer+="P";
				else
					answer+="N";
			}
			int temp=n,sum=0;
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}
			answer+=sum;
			if(n%2==0)
				answer+=n/2;
			else
				answer+=(n-1)/2;
			output.add(answer);	
		}
		return output;

	}

}
