package operator.ShortHandAssignmentOperators;

public class HortHandAssignmentOperators {
    public static void main(String[] args) {
        int age = 5;
        System.out.println(age);

       // age = age + 3;//reassign
       // System.out.println(age);

        age += 3;// shorthand assignment /
        System.out.println(age);

        age -= 2;
        System.out.println(age);

        age *= 2;
        System.out.println(age);

        age /= 3;
        System.out.println(age);

        age %= 3;
        System.out.println(age);




        int johnsAge = 5;

        //Please find the age of John for 5 years later

        //int johnsAge5YearsLater = johnsAge + 5;  ==
        //johnsAge = johnsAge + 5;

        johnsAge += 5; // 10

        System.out.println(johnsAge);


        String name = "Alex"; // Alexander

        //String name2 = name + "an";
        //name = name + "an";
        name += "an"; // Alexan
        name += "d"; // Alexand
        name += "e"; //Alexande
        name += "r"; //Alexander

        System.out.println(name); // Alexan

    }

}
