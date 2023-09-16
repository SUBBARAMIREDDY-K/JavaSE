package wipro;

public class IsAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ram";
		String s2="mak";
		System.out.println(isAnagram(s1,s2));

	}
	static boolean isAnagram(String s1,String s2)
	{
		int frequencies[] = new int[26];
		s1.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			frequencies[s1.charAt(i)-'a']++;
		}
		s2.toLowerCase();
		for(int i=0;i<s2.length();i++)
		{
			int index=s2.charAt(i)-'a';
			if(frequencies[index]==0)
				return false;
			frequencies[index]--;
		}
		return true;
	}

}
