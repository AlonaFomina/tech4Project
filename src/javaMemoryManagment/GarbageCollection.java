package javaMemoryManagment;

public class GarbageCollection {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("\n---------------object references before losing references");
        System.out.println(dog1);//Dog@7ea987ac
        System.out.println(dog2);//Dog@12a3a380
        System.out.println(dog1.equals(dog2));//false

        System.out.println("\n---------------object references after losing references");

        dog1 = dog2;//dog1 losing reference here and garbage collected


        System.out.println(dog1);//Dog@12a3a380
        System.out.println(dog2);//Dog@12a3a380
        System.out.println(dog1.equals(dog2));//true

        System.gc();;
        Runtime.getRuntime().gc();
    }
}
