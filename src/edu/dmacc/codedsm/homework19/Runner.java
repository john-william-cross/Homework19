package edu.dmacc.codedsm.homework19;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {


    Function stringToInt;
    BiFunction stringsToInt;
    Consumer useString;
    Supplier makeString;

    public static void main(String[] args) {


        Function<String, Integer> stringToInt = s ->
                s.length();


        BiFunction<String, String, Integer> stringsToInt = (r, s) ->
                r.length() + s.length();


        Consumer<String> useString = (String s) ->
                System.out.println(s);


        Supplier<String> makeString = () ->
                "hello";

    }


    /*public static Integer stringToInt(String s) {
        return s.length();
    }


    public Integer stringsToInt(String r, String s) {
        return r.length() + s.length();
    }


    public static void useString(String s) {
        System.out.println(s);
    }


    public String makeString() {
        return "Hello!";
    }*/
}




/*
public Integer stringToInt(String s) { return s.length(); }
public Integer stringsToInt(String r, String s) { return r.length() + s.length(); }
public void useString(String s) { System.out.println(s); }
public String makeString { return “Hello!”;
 */