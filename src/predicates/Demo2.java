package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;
    int experience;

    Employee(String name, int sal, int exp) {
        ename = name;
        salary = sal;
        experience = exp;
    }
}

public class Demo2 {
    public static void main(String[] args) {
    /*
    emp onj --->  return name if sal > 50K exp > 3
     */
        Employee emp = new Employee("John", 50000, 5);
        Employee emp1 = new Employee("Alex", 50000, 3);
        Predicate<Employee> pr =
                e -> (e.salary > 30000 && e.experience > 3);
//        System.out.println(pr.test(emp));
//        System.out.println(pr.test(emp1));

        //Ex_2:
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("John", 50000, 5));
        al.add(new Employee("David", 20000, 2));
        al.add(new Employee("Scott", 30000, 3));
        al.add(new Employee("Scott", 40000, 6));

        for (Employee e : al) {
            if (pr.test(e)) {
                System.out.println(e.ename + " " + e.salary);
            }
        }
    }
}
