package MathClass;

import com.sun.xml.internal.ws.encoding.MtomCodec;

public class ExerciseMathRandom {
    public static void main(String[] args) {

        //int  ran = (int) (Math.random() * (54) + (45));
        System.out.println((int) (Math.random() * (54) + (45)));

        int ran1  = (int) (Math.random() * (19) + (67));
        int ran2 = (int) (Math.random() * (19) + (67));



        System.out.println(Math.max(ran1 , ran2) + "\n" +
                Math.min (ran1 , ran2));






    }
}
