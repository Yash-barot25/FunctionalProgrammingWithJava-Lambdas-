package com.company.yash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        threadClass threadClass = new threadClass();
//        threadClass.run();

   //     new Thread(new threadClass()).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hey i'm thread");
//            }
//        }).start();

      //  new Thread(() -> System.out.println("hey im a thread")).start();
//    Student student1 =new Student("yash",1);
//    Student student2 = new Student("dipu",2);
//        Student student3 = new Student("meet",3);
//        Student student4 = new Student("parth",4);
//    List<Student> students = new ArrayList<>();

//    students.add(student1);
//    students.add(student2);
//        students.add(student3);
//        students.add(student4);
//    for (Student student : students){
//        System.out.println("name : " + student.getName());
//    }
//
////    Collections.sort(students, new Comparator<Student>() {
////        @Override
////        public int compare(Student o1, Student o2) {
////            return o1.getName().compareTo(o2.getName());
////        }
////    });
//
//       // Collections.sort(students,( s1, s2) ->  { return  s1.getName().compareTo(s2.getName()); });
//        students.sort(Comparator.comparing(Student::getName));
//
//        System.out.println("===========================");
//        for (Student student : students){
//            System.out.println("name : " + student.getName());
//        }

//      String val =  con(new concating() {
//            @Override
//            public String concat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "yash ", "dipu");
//        System.out.println(val);

        concating c = (String s1,String s2) -> s1.toUpperCase()  + s2.toUpperCase();
        String val = con(c,"yash"," Dipu");
        System.out.println(val);

    }


    public static String con(concating c, String s1, String s2){
        return c.concat(s1,s2);
    }
}

interface concating{
    public String concat(String s1, String s2);

}
//  class Student{
//    private String name;
//    private int id;
//
//
//      public Student(String name, int id) {
//          this.name = name;
//          this.id = id;
//      }
//
//      public String getName() {
//          return name;
//      }
//
//      public void setName(String name) {
//          this.name = name;
//      }
//
//      public int getId() {
//          return id;
//      }
//
//      public void setId(int id) {
//          this.id = id;
//      }
//  }

//class threadClass implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("hey i'm a thread...");
//    }
//}
//        String str = concatnate(new concat() {
////            @Override
////            public String con(String s1, String s2) {
////                return s1.toUpperCase() + s2.toUpperCase();
////            }
////        },"yash"," dipu");
////        System.out.println(str);
//
//        concat ct = (s1,s2) -> s1.toUpperCase() + s2.toUpperCase();
//        String str = concatnate(ct,"yash"," dipu");
//        System.out.println(str);
//    }
//
//    private static  String concatnate(concat ct,String s1,String s2){
//        return  ct.con(s1,s2);
//    }
//}
//
////        Student student1 = new Student("yash",1);
////        Student student2 = new Student("dipu",2);
////        Student student3 = new Student("parth",3);
////        List<Student> students = new ArrayList<>();
////        students.add(student1);
////        students.add(student2);
////        students.add(student3);
////
//////        Collections.sort(students, new Comparator<Student>() {
//////            @Override
//////            public int compare(Student student1, Student student2) {
//////                return student1.getName().compareTo(student2.getName());
//////            }
//////        });
////
////        Collections.sort(students,( stu1, stu2) -> stu1.getName().compareTo(stu2.getName()));
////
////          for (Student student : students){
////              System.out.println(student.getName());
////          }
//
//
////	  run run = new run();
////	  run.run();
////        new Thread(new run()).start();
////        new Thread(() -> {
////            System.out.println("hey im runnable");
////            System.out.println("another");
////            System.out.println("last one");
////        } ).start();
//////            @Override
////            public void run() {
////                System.out.println("I'm runnable");
////            }
////        }).start();
////    }
////}
////class run implements Runnable{
////    @Override
////    public void run() {
////        System.out.println("Hey i'm runnable...");
////    }
////}
//
//interface concat {
//    public String con(String s1, String s2);
//}
////class Student{
////    private String name;
////    private int id;
////
////    public Student(String name, int id) {
////        this.name = name;
////        this.id = id;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
//}