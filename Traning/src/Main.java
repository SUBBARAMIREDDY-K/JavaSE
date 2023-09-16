import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Batch
{
	public boolean lengthCheck(String str)
	{
		if(str.length()== 12)
			return true;
		return false;
	}
	public boolean batchNumber(String str)
	{
		String s = str.substring(0,4);
		Pattern pattern = Pattern.compile("[A-Z]{2}[0-9][A-Z]");
	    Matcher matcher = pattern.matcher(s);
	    boolean matchFound = matcher.find();
	    if(matchFound)
	    	return true;
	    return false;
	}
	public boolean yearCheck(String str)
	{
		int year = Integer.parseInt(str.substring(4,8));
		if(year >= 2015 && year <=2020)
			return true;
		return false;
	}
	public boolean monthCheck(String str)
	{
		int month = Integer.parseInt(str.substring(8,10));
		if(month>=1 && month<=12)
			return true;
		return false;
	}
	public boolean dayCheck(String str)
	{
		int day = Integer.parseInt(str.substring(10,12));
		if(day >= 1 && day<=31)
			return true;
		return false;
	}
	public String printBatchNumber(String str)
	{
		if(batchNumber(str))
			return str.substring(0,4);
		return null;
	}
	public String printDate(String str)
	{
		if(dayCheck(str) && monthCheck(str) && yearCheck(str))
		{
			String day = str.substring(10,12);
			String month = str.substring(8,10);
			String year = str.substring(4,8);
			return day+"/"+month+"/"+year;
		}
		return null;
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BL7A20181201";
		Batch b = new Batch();
		System.out.println(b.lengthCheck(s));
		System.out.println(b.printBatchNumber(s));
		System.out.println(b.printDate(s));
		

	}

}
