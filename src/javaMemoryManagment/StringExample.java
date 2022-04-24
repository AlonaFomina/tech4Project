package javaMemoryManagment;

public class StringExample {
    public static void main(String[] args) {
        //first wasy to create string
        String name1 = "John";

        //2-nd way
        String name2 = new String("Alex");

        //3-rd way
        String name3 = "Alex";
        String name4 = "John";


        System.out.println(name1 == name4);//true
        System.out.println(name2 == name3);//false
        System.out.println(name2.equals(name3));//true

    }
}
