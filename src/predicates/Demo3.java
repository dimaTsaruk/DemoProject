package predicates;

//Joining Predicates - and, or, negate
//p1  -- checks number is even
//p2 -- checks greater then 50

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {

        int a[] = {5, 3, 43, 23, 78, 55, 43, 90};

        Predicate<Integer> p1 = i -> (i % 2 == 0);
        Predicate<Integer> p2 = i -> (i > 50);

        //and
        System.out.println("Following are numbers EVEN & Greater than 50...");
        for (int i : a) {
            // if (p1.test(i) && p2.test(i)) {
            if (p1.and(p2).test(i))
                System.out.println(i);
        }

        //or
        for (int i : a) {
            // if (p1.test(i) && p2.test(i)) {
            if (p1.or(p2).test(i))
                System.out.println(i);
        }

        //negate
        for (int i : a) {
            if (p1.negate().test(i))
                System.out.println(i);
        }
    }
}

