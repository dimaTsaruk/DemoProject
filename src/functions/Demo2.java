package functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;

    Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> emplist = new ArrayList<Employee>();

        emplist.add(new Employee("David", 50_000));
        emplist.add(new Employee("Alex", 30_000));
        emplist.add(new Employee("John", 20_000));

        Function<Employee, Integer> fn = e -> {
            int sal = e.salary;
            if (sal >= 10_000 && sal <= 20_000)
                return (sal * 10 / 100);
            else if (sal > 20_000 && sal <= 30_000)
                return (sal * 20 / 100);
            else if (sal > 30_000 && sal <= 50_000)
                return (sal * 30 / 100);
            else return (sal * 40 / 100);
        };

        Predicate<Integer> p = b -> b > 5_000;

        for (Employee emp : emplist) {
            int bonus = fn.apply(emp); //Function

            if (p.test(bonus)) { //Predicated
                System.out.println(emp.ename + " " + emp.salary);
                System.out.println("Bonus is: " + bonus);
            }
        }
    }
}
