package practice;

public class elsesss {
    public static void main(String[] args) {

        int num1 = (int)(Math.random()* (74 - 32 + 1) + (32));
        int num2 = (int)(Math.random()* (74 -32 + 1) + (32));
        int num3 = (int)(Math.random()* (74 - 32 + 1) + (32));

        int max;
        int min;
        int mid;

        if (num1 > num2 && num1 > num3){
            max = num1;
        } else if (num2 > num1 && num2 > num3){
            max = num2;
        }else{
            max = num3;
        }

        if (num1 < num2 && num1 < num3){
            min = num1;
        } else if (num2 < num1 && num2 < num3){
            min = num2;
        }else{
            min = num3;
        }

        if (num1 != max && num1 != min){
            mid = num1;
        }else if(num2 != max && num2 != min){
            mid = num2;
        }else{
            mid = num3;
        }

        System.out.println("Random number 1 :" + num1
                + "\nRandom number 2 :" + num2
                +"\nRandom number 3 :" +num3 +
                "\nmax = " + max +
                "\nmin = " +  min+
                "\nmid = " + mid);
       /* if(num1>num2){
            if(num2>num3){
                middle=num2;
            }
            else if(num3>num1){
                middle=num1;
            }
            else{
                middle=num3;
            }
        }
        else{
            if(num2<num3){
                middle=num2;
            }
            else if(num3<num1){
                middle=num1;
            }
            else{
                middle=num3;
            }

        }
        System.out.println("Middle is " + middle);
        if (num1 < num2 && num2 < num3){
            System.out.println(num2);
        }
        else if(num2 < num1 && num1 < num3){
            System.out.println(num1);
        }
        else if(num1< num3 && num3< num2){
            System.out.println(num3);}*/
       /*if (num1 > num2 & num2 > num3){
            System.out.println(num2);
        }
        else if(num2 > num3 & num3 > num1){
            System.out.println(num3);
        }
        else if (num3 > num1 & num1> num2){
            System.out.println(num1);}*/

//        if ((num1<num2 &&num2 <num3) || (num3< num2 && num2 < num1)){
//            System.out.println(num2);
//        }
//        else if ((num1 < num3 && num3 <num2) || ( num2 < num3 && num3< num1)){
//            System.out.println(num3);
//        }
//        else if ((num2< nu    m1 && num1 < num3) || (num3< num1 && num1< num2)){
//            System.out.println(num1);
//        }
    }}


