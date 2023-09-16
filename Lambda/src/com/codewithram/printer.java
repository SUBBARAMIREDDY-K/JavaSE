package com.codewithram;

//A Interface which contains only single Abstract method then it is
public interface printer {
    void print(String message);
    default void printTwice(String message)
    {
        System.out.println(message);
    }
}
