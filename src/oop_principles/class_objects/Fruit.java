package oop_principles.class_objects;

public class Fruit {
    //instance variables

    public static boolean hasColor;
    static {
        System.out.println("Static block");
       hasColor =  true;
    }
    public String name;
    public String shape;
    public boolean isSweet;
    {
        System.out.println("Instance block");
        isSweet = true;
        name = "abc";
        shape = "round";
    }


    public static void main(String[] args) {
        System.out.println("Hello this is line 1 in the main method before object being created");
        Fruit fruit1 = new Fruit();

        System.out.println("Hello this is line 1 in the main method after object being created");


    }
}
