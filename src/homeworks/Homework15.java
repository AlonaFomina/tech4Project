package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework15 {
    public static void main(String[] args) {


        System.out.println("\n__________TASK-1__________\n");
        ArrayList<Integer> numsList = new ArrayList();
        numsList.add(10);
        numsList.add(23);
        numsList.add(67);
        numsList.add(23);
        numsList.add(78);

        System.out.println(numsList.get(3));
        System.out.println(numsList.get(0));
        System.out.println(numsList.get(2));
        System.out.println(numsList);


        System.out.println("\n__________TASK-2__________\n");

        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Brown");
        colours.add("Red");
        colours.add("White");
        colours.add("Black");
        colours.add("Purple");

        System.out.println(colours.get(1));
        System.out.println(colours.get(3));
        System.out.println(colours.get(5));
        System.out.println(colours);


        System.out.println("\n__________TASK-3__________\n");

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(23);
        ints.add(-34);
        ints.add(-56);
        ints.add(0);
        ints.add(89);
        ints.add(100);

        System.out.println(ints);
        Collections.sort(ints);
        System.out.println(ints);


        System.out.println("\n__________TASK-4__________\n");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);


        System.out.println("\n__________TASK-5__________\n");

        ArrayList<String> marvelChar = new ArrayList<>();
        marvelChar.add("Spider Man");
        marvelChar.add("Iron Man");
        marvelChar.add("Black Panter");
        marvelChar.add("Deadpool");
        marvelChar.add("Captain America");

        System.out.println(marvelChar);
        System.out.println(marvelChar.contains("Wolwerine"));


        System.out.println("\n__________TASK-6__________\n");

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Iron Man") && avengers.contains("Hulk"));


        System.out.println("\n__________TASK-7__________\n");

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList(new Character[]{'A','x','$', '%', '9', '*', '+', 'F', 'G'}));

        System.out.println(chars);
        for (Character aChar : chars) {
            System.out.println(aChar);
        }


        System.out.println("\n__________TASK-8__________\n");

        ArrayList<String> objectList = new ArrayList<>(Arrays.asList(new String[]{"Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"}));

        System.out.println(objectList);
        Collections.sort(objectList);
        System.out.println(objectList);

        int mCount = 0, aeCount = 0;
        for (String s : objectList) {
            if(s.startsWith("M") || s.startsWith("m"))mCount++;
            else if(s.toLowerCase().startsWith("a") || s.toLowerCase().startsWith("e")) aeCount++;
        }
        System.out.println(mCount);
        System.out.println(aeCount);


        System.out.println("\n__________TASK-9__________\n");

        ArrayList<String> kitchenObject = new ArrayList<>(Arrays.asList(new String[]{"Plate", "spoon", "fork", "Knife", "cup", "Mixer"}));

        System.out.println(kitchenObject);

        int upperCount = 0, lowerCount = 0,havePp = 0,endsWithP = 0;

        for (String s : kitchenObject) {
            if(Character.isUpperCase(s.charAt(0)))upperCount++;
            else if(Character.isLowerCase(s.charAt(0)))lowerCount++;
            if(s.toLowerCase().contains("p"))havePp++;
            if(s.toLowerCase().endsWith("p"))endsWithP++;
        }
        System.out.println("Elements starts with uppercase = " + upperCount +
                "\nElements starts with lowercase = " + lowerCount +
                "\nElements having P or p= " + havePp +
                "\nElements starting or ending with P or p = " + endsWithP);


        System.out.println("\n__________TASK-10__________\n");

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(new Integer[]{3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78}));

        System.out.println(integers);

        int divby10 = 0, divBy15andEven = 0, oddLessThat20 = 0,lessThan15AndGraterThan50 = 0;
        for (Integer integer : integers) {
            if(integer % 10 == 0) divby10++;
            if(integer % 2 == 0 && integer > 15) divBy15andEven++;
            if(integer % 2 !=0 && integer < 20) oddLessThat20++;
            if(integer < 15 || integer>50) lessThan15AndGraterThan50++;
        }
        System.out.println("Elements that can be divided by 10 = " + divby10 +
                "\nElements that are even and greater than 15 = " + divBy15andEven +
                "\nElements that are odd and less than 20 = " +oddLessThat20  +
                "\nElements that are less than 15 or greater than 50 = " + lessThan15AndGraterThan50);
    }
}
