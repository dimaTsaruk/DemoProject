package LambdaExpression;

@FunctionalInterface
interface Cab {
    public void bookCab();
}

//class Ola implements Cab {
//    public void bookCab() {
//        System.out.println("Ola cab is bookes...");
//    }
//
//    () -> System.out.println("Ola cab is bookes...");
//}

public class Test {
    public static void main(String[] args) {

        Cab cab = //new Ola();
                () -> System.out.println("Ola cab is bookes...");
        cab.bookCab();
    }
}
