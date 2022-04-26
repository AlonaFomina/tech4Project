package singelton;

public class Driver {
/*
Have to achieve singleton
1.make constructor privet
2. declare an instance variable of the object driver
3.make this variable static and provide static get driver method
4. provide if condition to initialize driver instance variable,
if its null -> initialize it,
if not then return driver which was already initialize it


//note: we understand that the single Driver object is encapsulated
 */
private Driver(){

}
 private static Driver driver = new Driver();//declared object



    public static Driver getDriver() {
        if(driver == null) driver = new Driver();
        return driver;
    }
}
