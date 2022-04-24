package arrays;

import java.util.Arrays;

public class TwoDementonalArrays {
    public static void main(String[] args) {
        String[][] studentGroups = { {"Kaly","Guluzar","Melda"} ,
                                      {"Tory","David"} ,
                                       {"Aib", "Data"}
                                    };

        System.out.println(studentGroups[0] [1]);//Guluzar
        System.out.println(studentGroups[1] [0]);//Tory
        System.out.println(studentGroups[1] [1]);//David

        System.out.println(studentGroups.length);//3
        System.out.println(studentGroups[1].length);//2

        System.out.println(Arrays.toString(studentGroups[2]));//[Aib, Data]

        System.out.println("\n----------Printing all groups member------------\n");

        System.out.println(Arrays.deepToString(studentGroups));


        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.deepToString(studentGroups[i]));
        }

        for (String[] group : studentGroups) {
            System.out.println(Arrays.toString(group));
        }

        System.out.println("\n----------Printing each member------------\n");
        for (int i = 0; i < studentGroups.length; i++) {
            for (int j = 0; j < studentGroups[i].length; j++) {
                System.out.println(studentGroups[i][j]);

            }

        }
        System.out.println("\n----------Printing each member with each loop------------\n");


        for (String[] sg : studentGroups) {
            for (String member : sg) {
                System.out.println(member);

            }

        }

    }
}
