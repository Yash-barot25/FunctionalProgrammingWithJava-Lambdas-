package com.company.yash;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //  new Thread(new test()).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello  universe!!!");
//            }
//        }).start();

//        new Thread(() -> System.out.println("Hello universe!!!")).start();

        Employee employee1 = new Employee("yash barot", 20);
        Employee employee2 = new Employee("dipu patel", 22);
        Employee employee3 = new Employee("gabbar bhrambhat", 17);
        Employee employee4 = new Employee("bado dhed", 15);
        Employee employee5 = new Employee("batti bhangi", 19);
        Employee employee6 = new Employee("samir patel", 24);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("++++++++++++++++++++++++++");
        employees.forEach(employee -> System.out.println(employee));
        System.out.println("++++++++++++++++++++++++++");
        employees.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Sorted list of employees");

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        employees.forEach(System.out::println);
        Collections.shuffle(employees);
        System.out.println("++++++++++++++++++++++++++");
        employees.forEach(System.out::println);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("++++++++++++++++++++++++++");
        employees.forEach(System.out::println);
        Collections.shuffle(employees);

        System.out.println("++++++++++++++++++++++++++");
        employees.forEach(System.out::println);

        employees.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("++++++++++++++++++++++++++");
        employees.forEach(System.out::println);

        Collections.shuffle(employees);
        System.out.println("++++++++++++++++++++++++++");
        employees.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++");
        employees.sort(Comparator.comparing(Employee::getName));
        employees.forEach(System.out::println);
        System.out.println("\n*****************\n");
        String frds = useInterface(new UpperAndConcat() {
            @Override
            public String toUppperConcat(String s1, String s2) {
                return s1.toUpperCase() + " " + s2.toUpperCase();
            }
        }, "Yash", "Dipu");
        System.out.println(frds);

        frds = useInterface((s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase(), "yashu", "dipu");
        System.out.println(frds);

        UpperAndConcat uc = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();

        frds = useInterface(uc, "hello", "world");
        System.out.println(frds);

        System.out.println("\nEmployees\n");
//        for (Employee employee : employees) {
//
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//
//        }
        System.out.println("////////////////////////////////////");

//        for (int i= 0; i < employees.size(); i++){
//           employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
        // tester();

        System.out.println("//////////********************\n-------------------****************//////////////////////-----------------");
//        System.out.println("Not eligible to vote:");
//        for (Em+ployee employee : employees) {
//            if (employee.getAge() <= 19) {
//                System.out.println(employee.getName() + ":" + employee.getAge());
//            }
//        }
//
//        System.out.println("**************\nEligible to vote:");
//        for (Employee employee : employees) {
//            if (employee.getAge() > 19) {
//                System.out.println(employee.getName() + ":" + employee.getAge());
//            }
//        }
//
//        System.out.println("Not eligible to vote:");
//        employees.forEach(employee -> {
//            if (employee.getAge() <= 19) {
//                System.out.println(employee.getName() + ":" + employee.getAge());
//            }
//        });
//        System.out.println("**************\nEligible to vote:");
//        employees.forEach(employee -> {
//            if (employee.getAge() > 19) {
//                System.out.println(employee.getName() + ":" + employee.getAge());
//            }
//        });

        voters(employees, "Eligible voters", employee -> employee.getAge() > 19);
        voters(employees, "Not Eligible voters", employee -> employee.getAge() <= 19);
        System.out.println("=============");
        IntPredicate dp = i -> i > 50;
        IntPredicate dp2 = i -> i < 100;
        System.out.println(dp.test(4));
        System.out.println(dp2.test(4));
        boolean flager = dp.and(dp2).test(45);
        boolean flager2 = dp.or(dp2).test(6);
        System.out.println(flager);
        System.out.println(flager2);
        System.out.println(dp.negate().negate().test(100));
        System.out.println("=============");
        Random random = new Random();
        for (int i = 0; i <= 5; i++) {
            System.out.println(random.nextInt(100));
        }

        Supplier<Integer> supplier = () -> random.nextInt(100);
        for (int i = 0; i <= 5; i++) {
            System.out.println(supplier.get());
        }

        Supplier<Employee> supplyEmployee = () -> new Employee("hello", 28);

        Employee employee = supplyEmployee.get();
        System.out.println(employee.getAge());

        Function<Employee, String> lastName = (myEmployee) -> myEmployee.getName(); //.substring(myEmployee.getName().indexOf(" ") + 1);
        Function<Employee, String> firstName = (myEmployee) -> myEmployee.getName().substring(0, myEmployee.getName().indexOf(" "));
        Function<String, String[]> toUpper = emp -> emp.split(" ");
        System.out.println(lastName.apply(employee1));
        System.out.println(firstName.apply(employee1));
        System.out.println(printLastNames(lastName, employee1));
        for (Employee myEmployee : employees) {
            System.out.println(printLastNames(firstName, myEmployee));
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
        Function<Employee, String[]> fullname = lastName.andThen(toUpper);
       String[] words =  fullname.apply(employee1);
        System.out.println(words[0]);
        System.out.println(words[1]);
    }

    private static String printLastNames(Function<Employee, String> f, Employee employee) {
        return f.apply(employee);
    }

    private static void voters(List<Employee> employees, String caption, Predicate<Employee> employeePredicate) {
        System.out.println(caption);
        employees.forEach(employee -> {
            if (employeePredicate.test(employee)) {
                System.out.println(employee.getName() + ":" + employee.getAge());
            }
        });
    }

    private static void tester() {

        final int i = 0;

//        new Thread(() -> {
////            System.out.println("Hello world!!!");
////            System.out.println("i is " + i);
////
////
////        }).start();


        new Thread(new Runnable() {
            int j = 0;

            @Override
            public void run() {
                while (j < 5) {
                    //System.out.println(i);
                    System.out.println(++j);
                }


            }
        }).start();


    }

    private static String useInterface(UpperAndConcat uc, String s1, String s2) {
        return uc.toUppperConcat(s1, s2);
    }
}

interface UpperAndConcat {

    String toUppperConcat(String s1, String s2);


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
        return "I'm " + this.name + ". i'm " + this.age + " years old";
    }
}


class test implements Runnable {


    @Override
    public void run() {
        System.out.println("Hello universe!!!");
    }
}