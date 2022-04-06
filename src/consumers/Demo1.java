package consumers;

import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        /*
        Consumer always take one arg or param, it doesn't return any value,
        but it performs some operation.
         */
        Consumer<String> c = s -> System.out.println(s);

        c.accept("Welcome");

    }
}
