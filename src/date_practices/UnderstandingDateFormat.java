package date_practices;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate.getDate());
        System.out.println(currentDate.toGMTString());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Today is = " + sdf.format( currentDate));

        SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Today is = " + sdf1.format( currentDate));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE h:mm a");
        System.out.println("Today is the " + simpleDateFormat.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));//Saturday
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate));//2022


        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate));//10 o'clock AM, Central Daylight Time




    }
}
