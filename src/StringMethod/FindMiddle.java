package StringMethod;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import utilities.StringHelper;

public class FindMiddle {
    public static void main(String[] args) {

        String name1 = "Taylor";
        String name2 = "Alona";

        System.out.println(StringHelper.getMiddle(name1));
        System.out.println(StringHelper.getMiddle(name2));
        System.out.println(StringHelper.getMiddle("Kally"));
        System.out.println(StringHelper.getMiddle("Daria"));
        System.out.println(StringHelper.getMiddle("Guluzar"));

    }
}
