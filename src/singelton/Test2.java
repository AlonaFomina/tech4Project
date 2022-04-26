package singelton;

public class Test2 {
    public static void main(String[] args) {

        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();
        Driver d4 = Driver.getDriver();
        Driver d5 = Driver.getDriver();
        Driver d6 = Driver.getDriver();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);



        for (int i = 0; i <1000 ; i++) {
            System.out.println(Driver.getDriver());
        }
    }
}
