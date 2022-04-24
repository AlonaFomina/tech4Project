package loops.nesteadLoops;

public class PrintAllLetters {
    public static void main(String[] args) {

        System.out.println("Lowercase letters:");
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");

        }
        System.out.println("\n\n Uppercase letter:");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }

        int start = 97;
        for (int i = 1; i <= 2; i++) {
            if (i == 1) {
                //first alteration
                // start point=97, end = 122
                System.out.println("Lowercase letters");
            } else {
                // start point=65, end = 90
                System.out.println("Uppercase letters");
                // second alteration
                start = 65;
            }
            for (int j = start; j <= start + 25; j++) {
                System.out.println((char) j);

            }
        }

        System.out.println("\n\nSeparate loops solution");

        System.out.println("Lowercase letters");
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i + " ");
        }
        System.out.println("Uppercase letters");
        for (int i = 97; i <=122; i++) {
            System.out.println((char)i + " ");

        }
        System.out.println("End of the program!");
    }
}
