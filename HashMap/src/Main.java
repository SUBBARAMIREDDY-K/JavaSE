import java.util.*;
class Cmp implements Comparator<Map.Entry<Integer,Integer>>
{

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if(o1.getValue()==o2.getValue())
            return o1.getKey()-o2.getKey();
        return o2.getValue()- o1.getValue();
    }
}
public class Main {
    public static void main(String[] args) {

       int arr[]={10,2,3,10,3,10,3,2,4,2,21,10};
        HashMap<Integer,Integer> hs = new HashMap<Integer, Integer>();
        for(int ele: arr)
            hs.put(ele,hs.getOrDefault(ele,0)+1);
        System.out.println(hs);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hs.entrySet());

        Collections.sort(list,new Cmp());
        System.out.println(list);
        int index=0;
        for(Map.Entry<Integer,Integer> keyV:list)
        {
            for(int i=0;i<keyV.getValue();i++)
            {
                arr[index++]=keyV.getKey();
            }
        }
        System.out.println("Eelements : "+Arrays.toString(arr));


    }
}