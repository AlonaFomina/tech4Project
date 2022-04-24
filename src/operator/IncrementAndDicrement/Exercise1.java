package operator.IncrementAndDicrement;

public class Exercise1 {
    public static void main(String[] args) {
        int i = 5;

        int age = 10*(i++);
        System.out.println(age);

        age = 10 * i;
        System.out.println(age);


        i = i + 1;

        System.out.println(i);

    }
}
