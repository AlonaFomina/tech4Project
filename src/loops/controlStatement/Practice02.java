package loops.controlStatement;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number between 0 and 10:");
        int n1 = scan.nextInt();
        System.out.println("Please enter the number between 0 and 10:");
        int n2 = scan.nextInt();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);


        for (int i = min; i <= max; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }


        //2-nd way

        for (int j = Math.min(n1, n2); j < Math.max(n1, n2); j++) {
            if (j != 5) System.out.println(j);

        }

    }
}
