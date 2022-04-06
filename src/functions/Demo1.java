package functions;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {

        Function<Integer, Integer> f = n -> n * n;

        System.out.println(f.apply(5));
        System.out.println(f.apply(8));
        System.out.println(f.apply(4));

        //String len
        //String ---> len ---> int
        Function<String, Integer> fn = s -> s.length();

        System.out.println(fn.apply("Welcome"));
        System.out.println(fn.apply("Java Programming"));

    }
}
