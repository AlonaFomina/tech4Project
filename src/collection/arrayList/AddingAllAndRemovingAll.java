package collection.arrayList;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {

        System.out.println("__________Task-1__________");

        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars is = " + germanCars);


        System.out.println("__________Task-2__________");

        ArrayList<String> JapanCars= new ArrayList<>();

        JapanCars.add("Honda");
        JapanCars.add("Toyota");
        JapanCars.add("Lexus");

        System.out.println("Japanese cars is = " + JapanCars);


        System.out.println("__________Task-3__________");

        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars is = " + luxuryCars);


        System.out.println("__________Task-4__________");

        ArrayList<String> inventory = new ArrayList<>();

        System.out.println("Inventory at the beginning is = " + inventory);

        //adding german cars to the inventory
        inventory.addAll(germanCars);
        System.out.println("Inventory at the beginning is = " + inventory);


        inventory.addAll(luxuryCars);
        System.out.println("Inventory at the beginning is = " + inventory);

        inventory.addAll(1, JapanCars);
        System.out.println("Inventory at the beginning is = " + inventory);

        inventory.addAll(JapanCars);
        System.out.println("Inventory at the beginning is = " + inventory);

        inventory.addAll(luxuryCars);
        System.out.println("Inventory at the beginning is = " + inventory);

        inventory.removeAll(JapanCars);
        System.out.println("Inventory at the beginning is = " + inventory);


        inventory.remove("Audi");
        inventory.remove("BMW");
        inventory.remove("Tesla");

        System.out.println("Inventory at the beginning is = " + inventory);

        ArrayList<String> carsToBeRemoved = new ArrayList<>();
        carsToBeRemoved.remove("Audi");
        carsToBeRemoved.remove("BMW");
        carsToBeRemoved.remove("Tesla");

        System.out.println("Inventory at the beginning is = " + inventory);
        inventory.removeAll(carsToBeRemoved);
    }
}
