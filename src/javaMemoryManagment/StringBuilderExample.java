package javaMemoryManagment;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("John");//
        sb.append("athan");//Johnathan

        System.out.println(sb);//Johnathan
        sb.append("Hello ",0, 5);//JohnathanHello
        System.out.println(sb);

        sb.append(123);
        System.out.println(sb);//JohnathanHello123

        sb.insert(2,"$$$");//Jo$$$hnathanHello123
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);//321olleHnathanh$$$oJ
    }
}
