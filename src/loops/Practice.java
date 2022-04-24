package loops;

public class Practice {
    public static void main(String[] args) {
        /*TASK-1
Write a program that prints all the numbers between 1-100
But do not print any number that can be divided by 2 or 3

Expected output:
1
5
7
11
13
17
19
23
.
.
.
97
 */
        System.out.println("___________1 st______________");
        for (int i = 1; i <=100; i++){
            if (!(i % 2 ==0 || i % 3 == 0)){
                System.out.println(i);
            }
        }

        System.out.println("___________2 nd______________");
        int count = 1;
        while(count < 101) {
            if (!(count % 2 == 0 || count % 3 == 0)) {

                count++;
            }

            System.out.println("___________3 th______________");
            int start = 1;
            do {
                if(start % 2 != 0 && start % 3 != 0) System.out.println(start);
                start++;
            }
            while (start <= 100);


        }
    }
}
