package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    private static Car car1;

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        System.out.println(car1.getClass().getName());//oop_principles.class_objects.Car
        System.out.println(car1.equals(car1));

        car1.make = "Porshe";
        car1.model = "Macan";
        car1.year = 2022;
        car1.color = "Green";
        System.out.println(car1);

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        Car car2 = new Car();
        System.out.println(car2);

        car2.make = "BMW";
        car2.model = "M3";
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        Car car3 = new Car();
        System.out.println(car3);

        car3.make = "Tesla";
        car3.model = "Model S";
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1.drives();
        car2.drives();
        car3.drives();

        car1.honks();
        car2.honks();
        car3.honks();

        Car car4 = new Car();
        car4.make = "Tesla";
        car4.model = "X";
        car4.year = 2022;
        car4.color = "blue";

        System.out.println("___________________-Cars List-__________________");
        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);
        myCars.add(car4);

        for (Car myCar : myCars) {
            System.out.println(myCar);
        }


        System.out.println("___________________-Cars List-__________________");
        for (Car myCar : myCars) {
            if(myCar.make.equals("Tesla")) System.out.println(myCar);

        }

        }
    }
