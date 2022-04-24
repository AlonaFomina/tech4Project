package javaMemoryManagment;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.setCharAt(2,'x');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


        sb.insert(0,"Hey ");
        System.out.println(sb);
    }
}
