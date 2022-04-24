package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "Hello World";
        str = str.replaceAll("[aeiouAEIOU]","");//After: Hll Wrld
        System.out.println("After: "+str);


        str1 = str1.replaceAll("[aeiouAEIOU]","\\$");//After: Hll Wrld
        System.out.println(str1);

        String str2 = "Hello123world";
        str2 = str2.replaceAll("[^0-9]","");
        System.out.println(str2);

        String str3 = "Hello123world";
        str3 = str3.replaceAll("[0-9]","");
        System.out.println(str3);

        String str4 = " abc 123$#^%";
        str4 = str4.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str4);

    }
}
