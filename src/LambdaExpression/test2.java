package LambdaExpression;

interface Kab {
    // public void bookKab(String source, String destination);
    public String bookKab(String source, String destination);
}
//
//class Olla implements Kab {
//    public String bookKab(String source, String destination) {
//        System.out.println("Ola kab is booked from " + source + " to " + destination);
//        return ("Price: 5000 RS");
//    }



//class Olla implements Kab {
//    public void bookKab(String source, String destination) {
//        System.out.println("Ola kab is booked from " + source + " to " + destination);
//    }
//}


public class test2 {
    public static void main(String[] args) {

        Kab cab = //new Olla();
//                (source, destination) ->
//                        System.out.println("Ola kab is booked from " + source + " to " + destination);

                (source, destination) -> {
                    System.out.println("Ola kab is booked from " + source + " to " + destination);
                    return ("Price: 5000 RS");
                };
        cab.bookKab("Hyd", "MMB");
    }
}
