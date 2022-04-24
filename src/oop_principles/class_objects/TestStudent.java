package oop_principles.class_objects;

import java.util.LinkedList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.firstName = "Alona";
        student1.lastName = "Fomina";
        student1.age = 27;
        student1.birthDate = 06 / 13 / 1994;
        student1.gender = 'F';
        student1.address = "6505 N Nashville Ave";
        student1.high = 5.7;
        student1.weight = 127.0;
        student1.email = "aloakw k@gmail.com";
        student1.id = 1;
        System.out.println(student1);


        Student student2 = new Student();
        student2.firstName = "Daria";
        student2.lastName = "Syvak";
        student2.age = 27;
        student2.birthDate = 05 / 30 / 1994;
        student2.gender = 'F';
        student2.address = "1026 Castilian Court";
        student2.high = 5.5;
        student2.weight = 127.0;
        student2.email = "DashaKabashya";
        student2.id = 2;
        System.out.println(student2);


        Student student3 = new Student();
        student3.firstName = "John";
        student3.lastName = "Doe";
        student3.age = 46;
        student3.birthDate = 01 / 01 / 1977;
        student3.gender = 'M';
        student3.address = "Chicago";
        student3.high = 5.7;
        student3.weight = 170.0;
        student3.email = "wfwfwfwfl.com";
        student3.id = 1001;
        System.out.println(student3);


        Student student4 = new Student();
        student4.firstName = "Kely";
        student4.lastName = "Ngo";
        student4.age = 16;
        student4.birthDate = 01 / 01 / 2006;
        student4.gender = 'F';
        student4.address = "Chicago";
        student4.high = 5.3;
        student4.weight = 150;
        student4.email = "kaly@gmail.com";
        student4.id = 1005;
        System.out.println(student4);


        Student student5 = new Student();
        student5.firstName = "Alex";
        student5.lastName = "Morgan";
        student5.age = 20;
        student5.birthDate = 01 / 01 / 2002;
        student5.gender = 'M';
        student5.address = "Chicago";
        student5.weight = 165;
        student5.high = 5.5;
        student5.email = "alex@gmail.com";
        student5.id = 1003;


        Student student6 = new Student();
        student6.firstName = "Jessie";
        student6.lastName = "Smith";
        student6.age = 15;
        student6.birthDate = 01 / 01 / 2007;
        student6.gender = 'F';
        student6.address = "Miami";
        student6.high = 5.7;
        student6.weight = 160;
        student6.email = "Jessie@gmail.com";
        student6.id = 1004;
        System.out.println(student6);


        System.out.println("\n_________________Student List___________\n");
        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println(students);


        System.out.println("\n_________________Student Loop___________\n");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\n_________________Student older then 25___________\n");
        for (Student student : students) {
            if (student.age > 25) System.out.println(student);

        }
        System.out.println("\n_________________Student from Chicago___________\n");
        int countChicago = 0;
        for (Student student : students) {
            if (student.address.contains("Chicago")) countChicago++;
        }
        System.out.println(countChicago);


        System.out.println("\n_________________Student Male and Female___________\n");

        int f = 0, m = 0;
        for (Student student : students) {
            if(student.gender == 'F') f++;
            else m++;

        }
        System.out.println("Male = " + m);
        System.out.println("Female = " + f);

        System.out.println("\n_________________Teens___________\n");
        int teens = 0;
        for (Student student : students) {
            if(student.age < 20 && student.age > 12) teens++;
        }
        System.out.println(teens);

        System.out.println("\n________________All info___________\n");
        for (Student student : students) {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.birthDate);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.weight);
            System.out.println(student.high);
            System.out.println(student.email);
            System.out.println(student.id);
            System.out.println("\nNext student\n");

        }
        students.forEach(student -> {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.birthDate);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.weight);
            System.out.println(student.high);
            System.out.println(student.email);
            System.out.println(student.id);
            student.study();
            student.eat();
            student.sleep();
            System.out.println();
        });

    }
}

