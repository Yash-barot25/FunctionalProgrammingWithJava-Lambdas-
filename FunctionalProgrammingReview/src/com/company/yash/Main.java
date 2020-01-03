package com.company.yash;

import java.util.*;
import java.util.function.*;

public class Main {

    //lambdas
    //streams
    //functional interfaces
    //java.util.function package
    //collection simplification

    public static void main(String[] args) {
        //new Thread(new MyThread()).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello universe!!!");
//            }
//        }).start();

        //    new Thread(() -> System.out.println("Hello universe!!!")).start();

        Employee employee1 = new Employee("yash barot", 20);
        Employee employee2 = new Employee("dipu patel", 21);
        Employee employee3 = new Employee("jaydat pancholi", 18);
        Employee employee4 = new Employee("parth bhangi", 19);
        Employee employee5 = new Employee("samir chauhan", 24);
        Employee employee6 = new Employee("smit patel", 28);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println("\n==========================\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n==========================\n");
        employees.forEach(employee -> System.out.println(employee));
        System.out.println("\n==========================\n");
        employees.forEach(System.out::println);
        separaotr();
        System.out.println("Im sorted");

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        employees.forEach(System.out::println);
        separaotr();
        Collections.shuffle(employees);
        System.out.println("i'm shuffled");
        employees.forEach(System.out::println);
        separaotr();

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Im sorted");
        employees.forEach(System.out::println);
        Collections.shuffle(employees);
        separaotr();
        System.out.println("i'm shuffled");
        employees.forEach(System.out::println);

        separaotr();
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Im sorted");
        employees.forEach(System.out::println);

        separaotr();
        Collections.shuffle(employees);
        System.out.println("i'm shuffled");
        employees.forEach(System.out::println);

        separaotr();
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Im sorted");
        employees.forEach(System.out::println);

        separaotr();
        System.out.println("///////////**************-----------------++++++++++++++");


        String output = useInterface(new UpperAndConcat() {
            @Override
            public String toUpperConcat(String s1, String s2) {
                return s1.toUpperCase() + " " + s2.toUpperCase();
            }
        }, "Hello", "world");
        System.out.println(output);
        separaotr();

        output = useInterface((s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase(), "hello", "universe!!!");
        System.out.println(output);

        UpperAndConcat uc = (s1, s2) -> {
            String outputVAlue = s1.toUpperCase() + " " + s2.toUpperCase();
            System.out.println("Dipu yash");
            return outputVAlue;
        };

        System.out.println(useInterface(uc, "HEllo", "folks"));
        separaotr();
//        for (Employee employee : employees) {
//
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//
//        }
//
//        System.out.println("\n------------------------------\n");
//
//        for (int i = 0 ; i < employees.size(); i++){
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }

        voters(employees, "Eligibale voters", employee -> employee.getAge() > 19);
        System.out.println("\n===================");
        voters(employees, "Not Eligibale voters", employee -> employee.getAge() <= 19);

        DoublePredicate doublePredicate = i -> i > 2.33;
        System.out.println(doublePredicate.test(2.5));


        IntPredicate p1 = i -> i > 50;
        IntPredicate p2 = i -> i < 100;

        System.out.println(p1.test(20));
        System.out.println(p2.test(10000));

        boolean vallue = p1.and(p2).test(55);
        System.out.println(vallue);
        vallue = p1.negate().negate().test(1000);
        System.out.println(vallue);


        Random random = new Random();

        Supplier<Integer> supplier =() -> random.nextInt(100);

        for (int i = 0; i < 5; i++){
            System.out.println(supplier.get());
        }

        Function<Employee, String> lastName = employee -> employee.getName().substring(employee.getName().indexOf(" ") + 1);
        Function<Employee, String> firstName = employee -> employee.getName().substring(0 , employee.getName().indexOf(" "));
        Function<String, String> upper = String::toUpperCase;
        Function<Employee, String> pieces = firstName.andThen(upper);
        String ln = lastName.apply(employees.get(0));
        System.out.println(ln);
        ln = firstName.apply(employees.get(0));
        System.out.println(ln);

        for (Employee myEmployee : employees){
            System.out.println(pieces.apply(myEmployee));
        }



    }

    private static String getFirstName(Function<Employee, String> fn, Employee employee){
       return fn.apply(employee);
    }

    private static void voters(List<Employee> employees, String caption, Predicate<Employee> employeePredicate) {
        System.out.println(caption);
        employees.forEach(employee -> {
            if (employeePredicate.test(employee)) {
                System.out.println(employee.getName() + ": " + employee.getAge());
            }

        });
    }

    private static String useInterface(UpperAndConcat uc, String s1, String s2) {
        return uc.toUpperConcat(s1, s2);
    }

    private static void separaotr() {
        System.out.println("\n==========================\n");
    }
}

interface UpperAndConcat {

    String toUpperConcat(String s1, String s2);

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hey i'm " + this.name + ". I'm " + this.age + " years old.";
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello universe!!!");
    }
}
