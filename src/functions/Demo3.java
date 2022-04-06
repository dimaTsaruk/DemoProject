package functions;

import java.util.function.Function;

/**
 * Function chaining concept
 * andThen()
 * compose()
 */
public class Demo3 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n * n;

        System.out.println(f1.andThen(f2).apply(2)); //first execute f1 then f2 --- 4  64

        System.out.println(f1.compose(f2).apply(2)); // first exec f2 then f1 --- 8  16


    }
}
