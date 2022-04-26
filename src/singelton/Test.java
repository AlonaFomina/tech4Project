package singelton;

public class Test {
    public static void main(String[] args) {
        //Driver d1 = new Driver();
        //Driver d2 = new Driver();

        //System.out.println(d1);
        //System.out.println(d2);
        //This  is no possible anymore as constructor is  privet
        System.out.println(Driver.getDriver());//singelton.Driver@7ea987ac
        System.out.println(Driver.getDriver());//singelton.Driver@12a3a380
        System.out.println(Driver.getDriver());//singelton.Driver@29453f44

        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());

    }
}
