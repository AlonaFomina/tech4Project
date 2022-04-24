package oop_principles.class_objects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Animal {

    //default constructor
    public Animal(){

    }
    public  Animal(String name, String color){
       this.name = name;
       this.color = color;
    }


    //Custom constructor that takes 6 arguments - name, color, age, isHerbivore, isCarnivore, isOmnivore

    public Animal(String name, String color, int age, boolean isHerbivore, boolean isCarnivore, boolean isOmnivore){
        //I should assign these local variables into instance variables
        this.color = color;
        this.age = age;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
        this.isOmnivore = isOmnivore;
        this.name = name;
    }


    //Fields of an Animal instance
    public static int noOfAnimals = 0;
    public static final boolean hasEyes = true;
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
    public String toString() {
        String s = "Animal{";
                if(name != null) s +="name='" + name + '\'';
                if(color != null) s +=", color='" + color + '\'';
                if(age != 0) s +=", age=" + age ;
                if(isCarnivore) s += ", isCarnivore=" + isCarnivore;
                if(isHerbivore) s +=", isHerbivore=" + isHerbivore ;
                if(isOmnivore) s +=", isOmnivore=" + isOmnivore;
                s += '}';
                return s;
    }

    //Testing Animal
    public static void main(String[] args) {


        Animal a1 = new Animal("Cow", "Black", 3, true, false, false);
        System.out.println(a1);

        Animal a2 = new Animal("Cat","Gray" , 1,false, false, true);
        System.out.println(a2);

        Animal a3 = new Animal("Parrot", "White", 2, true, false, false);
        System.out.println(a3);

        Animal a4 = new Animal("Lion", "Beige", 4, false,true, false);
        System.out.println(a4);

        List<Animal> animals = new LinkedList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);

        int herbivore = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int carnivore = (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int omnivore = (int) animals.stream().filter(animal -> animal.isOmnivore).count();

        System.out.println("Herbivore = " +herbivore);
        System.out.println("Carnivore = " +carnivore);
        System.out.println("Omnivore = " +omnivore);
        //int herbivore = 0, carnivore = 0, omnivore = 0;
        //for (Animal animal : animals) {
          //  if(animal.isHerbivore) herbivore++;

            //else if(animal.isOmnivore) omnivore++;
            //else carnivore++;
        //}
        //System.out.println("Herbivore = " + herbivore +
                //"\nCarnivore = " + carnivore +
                //"\nOmnivore = " + omnivore);


    }
}









