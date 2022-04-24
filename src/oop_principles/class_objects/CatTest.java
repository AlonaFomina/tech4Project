package oop_principles.class_objects;

public class CatTest {
    public static void main(String[] args) {

        Cat knopa = new Cat();
        knopa.name = "knopa";
        knopa.colour = "gray";
        knopa.behavior = "funny";
        knopa.size = "small";
        knopa.age = 1;
        knopa.likeFish = true;

        Cat kiwi = new Cat("kiwi", 2, "brown", "fat","funny",true);

        System.out.println(knopa);
        knopa.catLovesYou();

        knopa.catLovesYou(knopa.name);

    }
}
