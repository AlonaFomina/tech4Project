package MathClass;

public class MathClass {
    public static void main(String[] args) {
        int x = 8;
        int y = 20;
        int z = 6;
        int a = 34;
        int b = 123;


        int maxValueOfX = Math.max(x , y );// char can be put as well
        int maxValOfXZY =  Math.max( maxValueOfX , z);
        int maxvalueofab = Math.max(a,b);
        int maxAll = Math.max (maxValOfXZY , maxvalueofab );


        System.out.println(maxValueOfX);
        System.out.println(maxValOfXZY);
        System.out.println(maxValueOfX + maxvalueofab);


    }
}
