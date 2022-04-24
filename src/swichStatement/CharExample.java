package swichStatement;

public class CharExample {
    public static void main(String[] args) {
        char c = 'A';
        switch (c){
            case 'A':
                System.out.println("it is uppercase first letter");
                break;
            case '5':
                System.out.println("it is digit");
                break;
            case '$':
                System.out.println("it is dollar sign");
                break;
            default:
                System.out.println("it is not A,5 or $");

                //Uncharitable code -> never be executed
        }
    }
}
