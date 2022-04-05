package predicates;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        /**
         * Predicate is an interface that has only one abstract method
         * test(T t). It always takes only one param and returns boolean.
         * Use only if you have conditional checks in your program.
         */

        //Ex 1
        //declare LEX
        Predicate<Integer> p = i -> (i > 10);
        //call LEX, invoke method from Predicate interface
        System.out.println(p.test(20));
        System.out.println(p.test(0));

        //Ex 2
        //Check the length of given string is greater than 4 or not
        Predicate<String> pr = s -> (s.length() > 4);
        System.out.println(pr.test("Dima"));
        System.out.println(pr.test("Hi"));

        //Ex 3:
        //Print array elements whose size is > 4 from array.
        String names[] = {"David", "Scott", "Smith", "John", "Mary"};
        for (String name : names) {
            if (pr.test(name)) {
                System.out.println(name);
            }
        }

    }
}
