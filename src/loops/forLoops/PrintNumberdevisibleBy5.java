package loops.forLoops;

public class PrintNumberdevisibleBy5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
           if(i % 5 == 0) System.out.println(i);
        }
        String str = "TechGlobal School";

        for ( int i = 0 ; i <= str.length()-1; i++){
          //  System.out.println(str.charAt(i));
            System.out.println(str.charAt(i));
        }

        //firstChar = charAt(0);
        //secondChar = charAt(str.length()-1);


    }
}
