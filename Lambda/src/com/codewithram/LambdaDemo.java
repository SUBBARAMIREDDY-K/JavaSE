package com.codewithram;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public  static  void show()
    {
        List<Integer> list = List.of(1,23,4);
        for(var item: list)
            System.out.println(item);
        //Declarative Programming
        list.forEach(item-> System.out.println(item) );

        List<String> l1= List.of("a","b","c");
        Consumer<String> print1= item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//        ChainingOfConsumer
        l1.forEach(print1.andThen(printUpperCase));

        Supplier<Double> getRandom = ()  -> Math.random();
        var random = getRandom.get();
        System.out.println(random);

        Predicate<String> isLongerThan5 = str -> str.length() >5;
        boolean result = isLongerThan5.test("Rami");
        System.out.println(result);

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        Predicate<String> hasLeftRigthBrace = hasLeftBrace.and(hasRightBrace);
        boolean ret = hasLeftRigthBrace.test("{Key:Value}");
        System.out.println(ret);



    }
    public static void greet(printer p)
    {
        p.print("hello World");
    }
}
