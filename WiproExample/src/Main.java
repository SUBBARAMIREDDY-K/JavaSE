import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int input1[] = new int[11];
//        for(int i=0;i<11;i++)
//        {
//            input1[i]=sc.nextInt();
//        }
//        System.out.println(IsPrimeExceptSmallest.PrimeSumSmall(input1,11));
//        System.out.println(IsPrimeExceptSmallest.PrimeSumLarge(input1,11));

        Scanner sc = new Scanner(System.in);
//        ArrayList<String> arr = new ArrayList<>()
        String s=sc.next();
        TreeMap<Character,Integer> ts = new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<s.length();i++)
        {
            ts.put(s.charAt(i),ts.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(ts);
    }

}