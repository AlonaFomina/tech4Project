package oop_principles.class_objects;

public class Cat {
    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "likeFish=" + likeFish +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", behavior='" + behavior + '\'' +
                '}';
    }

    public Cat(String name,int age, String colour, String size, String behavior, boolean likeFish) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.size = size;
        this.behavior = behavior;
        this.likeFish = likeFish;
    }

    public String name;
    public boolean likeFish;
    public String colour;
    public int age;
    public String size;
    public String behavior;
    public static boolean catSleeps = true;

    public void catLovesYou(){
        System.out.println(name + " loves you!");
    }

    public void catLovesYou(String name){
        System.out.println(name + " loves you!");
    }


}
