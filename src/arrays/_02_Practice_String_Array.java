package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        System.out.println("_________________TASK - 1_____________________");

        String[] students = {"Alex", "Tom", "John","James","Jordan", "Lionel", "Adam"};

        System.out.println("Unsorted  array = " + Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("Sorted  array = " +  Arrays.toString(students));


        System.out.println("_________________TASK - 2_____________________");

            System.out.println("First name is = " + students[0] +
                    "\n Last name is = " + students[students.length-1]);


        System.out.println("_________________TASK - 3_____________________");

        int c = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i]. startsWith("A")) {
                c++;
            }
        }
        System.out.println(c);

        System.out.println("_________________TASK - 4_____________________");
        int c2 = 0;
        for (String s : students) {
            if(s.toUpperCase().startsWith("A")) c2 ++;
        }
        System.out.println(c2);

        System.out.println("_________________TASK - 5_____________________");

        int  cc = 0;
        for (String ae: students) {
            if (ae.toLowerCase().contains("a") || ae.toLowerCase().contains("e")) cc ++;
        }
        System.out.println(cc);

        System.out.println("_________________TASK - 6_____________________");

        int con = 0;
        for (int i = 0; i <students.length ; i++) {
            if(students[i].toLowerCase().contains("e") || students[i].toLowerCase().contains("a")) con++;
        }
        System.out.println(con);

        System.out.println("_________________TASK - 7_____________________");

        int c1 = 0;

        for (int i = 0; i <students.length ; i++) {
            if(students[i].length()>4) c1++;
        }
        System.out.println(c1);

        System.out.println("_________________TASK - 8_____________________");

        int c3 = 0;

        for (String nn: students) {
            if (nn.length()>4) c3 ++;
        }
        System.out.println(c3);

        /*
        Count how many names starts with J or j
        Count how many names starts or ends with S-s
        Count names has O-o
        Count names has even length
        Count names that has odd length
        Count names that starts with a vowel letter
         */

        System.out.println("_________________TASK - 8_____________________");

        int sss = 0;

        for (String element : students) {
            if( element.equals("hasJennifer")) sss++;
        }
        System.out.println( sss >= 1 );

        System.out.println("_________________TASK - 9_____________________");

        boolean hasJennifer = false;

        for (String st : students) {
            if(st.equalsIgnoreCase("hasJennifer")){
                hasJennifer = true;
                break;
            }
        } System.out.println(hasJennifer);

    }
}
