package arrays;

import java.util.Arrays;

public class _05_PRACTICE_Searching_in_Array {
    public static void main(String[] args) {

        System.out.println("__________TASK-1__________");

        boolean col = false;

        String[] object = {"Remote", "Micky Mouse", "Micky Mouse", " Kyeboard", "iPad"};

        for (String o : object) {
            if (o.equalsIgnoreCase("Mouse")) {
                col = true;
                break;
            }
        }
        System.out.println(col);


        System.out.println("__________TASK-2__________");

        /*
        TASK-2
Check the collection you have above and print true if one of the element is board
Print false otherwise
         */
        boolean board = false;

        for (String b : object) {
            if (b.equalsIgnoreCase("board")) {
                board = true;
                break;
            }
        }
        System.out.println(board);


        System.out.println("__________TASK-3__________");
        Arrays.sort(object);
        System.out.println(Arrays.binarySearch(object, "iPad"));
        System.out.println(Arrays.binarySearch(object, "Micky Mouse"));
        System.out.println(Arrays.binarySearch(object, "Phone"));//-4


         /*
        TASK-3
        Check if you have an element equals to "iPad"
        If so, print true
        Else, print false

        "Remote", "Mouse","Mouse", "Keyboard", "iPad"

        Arrays class has binarySearch() method that helps us find if our collection contains a specific element or not
        NOTE: To be able to use this method, your array MUST be sorted first

        This method is taking 2 args, first is your array collection and the second is the element you are looking for

        1.One element is found -> it returns the index of the element - more than or equal to zero
        2.Multiple elements are found -> it returns the index of last occurrence
        3.No element found -> always returns negative index (-possible index -1)

        System.out.println("\n--------TASK-3---------\n");

        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
        //                       0         1       2        3       4

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false*/


        System.out.println("__________TASK-4__________");

        int[] ints = {5, -2, 0, -7, 5, 8, 45,53};

        Arrays.sort(ints);

        System.out.println(Arrays.binarySearch(ints, 5) >= 0);
        System.out.println(Arrays.binarySearch(ints, 0) >= 0);
        System.out.println(Arrays.binarySearch(ints, 45) >= 0);
        System.out.println(Arrays.binarySearch(ints, 3) >= 0);
        System.out.println(Arrays.binarySearch(ints, -7) >= 0);

        System.out.println("__________TASK-5__________");
    }
}
