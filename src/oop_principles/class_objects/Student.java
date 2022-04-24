package oop_principles.class_objects;

public class Student {
    public Student(){

    }
    public String firstName;
    public String lastName;
    public int age;
    public int birthDate;
    public char gender;
    public String address;
    public double high;
    public double weight;
    public String email;
    public int id;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", high=" + high +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
    public void study(){
        System.out.println("This student study");
    }
    public void eat(){
        System.out.println("This student eat");
    }
    public void sleep(){
        System.out.println("This student sleep");
    }
}
