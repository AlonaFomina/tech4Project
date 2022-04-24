package oop_principles.class_objects;

public class Apple {
// default constractor
    public Apple(){

    }

    //Define instance variables(colour,taste,size, price)
    public String colour;
    public String taste;
    public double price;


    public String toString(){
        return "Apple {" +
                "color = '" + colour + "', " +
                "taste = '" + taste + "', " +
                "price = '" + price + "'} ";


    }
    }

