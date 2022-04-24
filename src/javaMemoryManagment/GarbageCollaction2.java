package javaMemoryManagment;

public class GarbageCollaction2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);//Dog@7ea987ac

        dog = null;
        System.gc();//A dog object is garbage collected
    }
}
