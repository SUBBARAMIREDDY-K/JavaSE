import java.util.ArrayList;
import java.util.Collections;

public class IsPrimeExceptSmallest {
    public static int PrimeSumSmall(int[] input1, int input2)
    {
        int sum=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele:input1)
        {
            if(isPrime(ele))
                arr.add(ele);
        }
        Collections.sort(arr);
        for(int i=1;i<arr.size();i++)
            sum+=arr.get(i);
        return sum;
    }
    public static boolean isPrime(int ele)
    {
        if(ele==1)
            return false;
        for(int i=2;i*i<=ele;i++)
        {
            if(ele%i==0)
                return false;
        }
        return true;
    }

    public static int NonPrime(int input1[],int input2)
    {
        int sum=0;
        for(int i=0;i<input2;i++)
        {
            if(!isPrime(i))
            {

            }
        }
        return 0;
    }
    public static int PrimeSumLarge(int[] input1,int input2)
    {
        int sum=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele:input1)
        {
            if(isPrime(ele))
                arr.add(ele);
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++)
            sum+=arr.get(i);
        return sum;
    }


}
