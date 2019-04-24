package edu.dmacc.codedsm.homework19;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {

        Function<String, Integer> stringToInt = s -> s.length();
        int stringToIntResult = stringToInt.apply("asdf");
        System.out.println(stringToIntResult);

        BiFunction<String, String, Integer> stringsToInt = (r, s) -> r.length() + s.length();
        int stringsToIntResult = stringsToInt.apply("aaef", "qwer");
        System.out.println(stringsToIntResult);

        Consumer<String> useString = s -> System.out.println(s);
        useString.accept("yolo");

        Supplier<String> makeString = () -> "hello";
        String makeStringResult = makeString.get();
        System.out.println(makeStringResult);

    }

}
