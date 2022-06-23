package interviewQuestions;

public class Fee5$ {
    /*
    > Every month 5$ fee.
    -> At the same time when you have 3 payments in a month AND if the payment is equal to or more than 100 you don’t get the fee for that month.
    -> int[] A = {100, -20, -30, -50}
    -> String[] D = {“2020-12-3”, “2020-12-24", “2020-12-13”, “2020-12-17"}
    -> 100 + (-20) + (-30) + (-50) - (5 * 11)= -55
     */
    public static void main(String[] args) {
        int[] a = {100, -10, -20, -30, -50};
        String[] b = {"2020-12-03", "2020-12-13", "2020-12-17", "2020-12-03", "2020-12-20"};

//        months[11][0] = A[1];
//        months[11][1] = 1;
//
//        months[11][0] += A[2];
//        months[11][1] += 1;
//
//        months[11][0] += A[3];
//        months[11][1] += 1;
//
//        months[11][0] += A[4];
//        months[11][1] += 1;


//        System.out.println(Arrays.deepToString(months));
        System.out.println(leftBalance(a, b));
    }

    public static int leftBalance(int[] money, String[] dates) {
        // creating a container for final balance and assigning the total fee
        int finalBalance = -60;

        // creating a multidimensional array for tracking months according to that months payment and how many times.
        // every single inner array's first index is amount.
        // every single inner array's second index is how many times.
        int[][] months = new int[12][2];

        for (int i = 0; i < dates.length; i++) {
            // adding EVERY payment to the final balance
            finalBalance += money[i];

            // only getting the payments NOT transfers
            if (money[i] < 0) {
                // getting the months as index dynamically
                int monthIndex = Integer.parseInt(
                        dates[i].substring(
                                dates[i].indexOf('-') + 1, dates[i].lastIndexOf('-'))
                ) - 1;
                months[monthIndex][0] += money[i];
                months[monthIndex][1] += 1;
            }
        }
        // returning their fees when times is more than or equals to 3 AND expenses more than or equals to 100
        for (int[] month : months) if (Math.abs(month[0]) >= 100 && month[1] >= 3) finalBalance += 5;
        return finalBalance;
    }

}
