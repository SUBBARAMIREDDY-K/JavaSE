import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        var list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-4);
        list.add(-5);
        list.add(7);
        list.add(7);
        list.add(-4);
        var c=list.stream().distinct().count();
        System.out.println(c);
        int x[]= {1,2,3,4,2,1,3,2,4};
        var k= Arrays.stream(x).distinct().count();
        System.out.println(k);


    }
}