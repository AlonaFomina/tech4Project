package enums;

public class TraversingEnum {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        for (Constance.Month month : Constance.Month.values()) {
            System.out.println(month);
        }
    }
}
