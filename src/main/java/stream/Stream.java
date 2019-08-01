package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.stream();

        String[] str = new String[10];
        Arrays.stream(str);

        java.util.stream.Stream.of("126","dd");

        java.util.stream.Stream.iterate(0,(x) -> x+2).limit(5).forEach((x) -> System.out.println(x));
        java.util.stream.Stream.generate(() -> Math.random()).limit(5).forEach(System.out::println);
    }
}
