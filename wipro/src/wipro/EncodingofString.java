package wipro;

import java.util.Scanner;

public class EncodingofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input1,input2,input3;
		input1 = sc.next();
		input2 = sc.next();
		input3 = sc.next();
		String f1="",m1="",l1="";
		String f2="",m2="",l2="";
		String f3="",m3="",l3="";
		int d=0;
		d=input1.length()/3;
		System.out.println(d);
		if(input1.length()%3==0)
		{
		
			f1=input1.substring(0,d);
			m1=input1.substring(d,2*d);
			l1=input1.substring(2*d);
			
		}
		else if(input1.length()%3==1)
		{
			f1=input1.substring(0,d);
			m1=input1.substring(d,2*d+1);
			l1=input1.substring(2*d+1);
		}
		else if(input1.length()%3==2)
		{
			f1=input1.substring(0,d+1);
			m1=input1.substring(d+1,2*d+1);
			l1=input1.substring(2*d+1);
		}
		
		d=input2.length()/3;
		
		if(input2.length()%3==0)
		{
		
			f2=input2.substring(0,d);
			m2=input2.substring(d,2*d);
			l2=input2.substring(2*d);
			
		}
		else if(input2.length()%3==1)
		{
			f1=input2.substring(0,d);
			m2=input2.substring(d,2*d+1);
			l1=input2.substring(2*d+1);
		}
		else if(input2.length()%3==2)
		{
			f1=input2.substring(0,d+1);
			m2=input2.substring(d+1,2*d+1);
			l2=input2.substring(2*d+1);
		}
		
		d=input3.length()/3;
		
		if(input3.length()%3==0)
		{
		
			f3=input3.substring(0,d);
			m3=input3.substring(d,2*d);
			l3=input3.substring(2*d);
			
		}
		else if(input3.length()%3==1)
		{
			f3=input3.substring(0,d);
			m3=input3.substring(d,2*d+1);
			l3=input3.substring(2*d+1);
		}
		else if(input3.length()%3==2)
		{
			f3=input3.substring(0,d+1);
			m3=input3.substring(d+1,2*d+1);
			l3=input3.substring(2*d+1);
		}
		
		String out1,out2,out3;
		out1=l1+f2+m3;
		out2=f1+m2+l3;
		out3=m1+l2+f3;
		
		String o="";
		for(int i=0;i<out3.length();i++)
		{
			
		}
		
		
	}

}
