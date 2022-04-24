package javaMemoryManagment;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age);

        Dog dog1 = new Dog();
        Dog dog2= new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1);//dog@7ea987ac
        System.out.println(dog2);//dog@12a3a380
        System.out.println(dog3);//dog@29453f44
    }
}
