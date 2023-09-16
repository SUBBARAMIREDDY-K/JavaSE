package wipro;

import java.util.Scanner;

public class StringQuestion {
	public String userIdGeneration(String input1,String
			input2,int input3,int input4){
			// Read only region end
			// Write code here...
			int s1=input1.length();
			int s2=input2.length();
			String longer="";
			String smaller="";
			String output1="";
			if(s1==s2)
			{
			if(input1.compareTo(input2)>0)
			{
			longer=input1;
			smaller=input2;
			}
			else
			{
			longer=input2;
			smaller=input1;
			}
			}
			if(s1>s2){
			longer=input1;
			smaller=input2;
			}
			else if(s1<s2)
			{
			longer=input2;
			smaller=input1;
			}
			String pin=input3+"";
			String output=smaller.charAt(0)+longer+pin.charAt
			(input4-1)+pin.charAt(pin.length()-input4);
			for(int i=0;i<output.length();i++)
			{
			if(Character.isLowerCase(output.charAt
			(i)))
			{
			output1+=Character.toUpperCase
			(output.charAt(i));
			}
			else
			{
			output1+=Character.toLowerCase
			(output.charAt(i));
			}
			}
			return output1;
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input1=sc.next();
		

	}

}
