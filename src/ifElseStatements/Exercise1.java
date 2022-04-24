package ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {

        int n1 = (int )(Math.random() * (90 - 45 + 1) + (45) );
        int n2 = (int )(Math.random() * (90 - 45 + 1) + (45) );
        int n3 = (int )(Math.random() * (90 - 45 + 1) + (45) );
        int max,min,mid;
        if (n1 > n2 & n2 > n3){
            max = n1;
        }
        else if(n2 > n1 & n2 > n3){
            max = n2;
        }
        else {
            max = n3;
        }
        if (n1 < n2 & n2 < n3){
            min = n1;
        }
        else if(n2 < n1 & n2 < n3){
            min = n2;
        }
        else {
            min = n3;
        }

       if ( n1 != max  && n1 != min) {
            mid = n1;

        }
       else if (n2 != max && n2 != min){
            mid = n2;

        }else  {
           mid = n3;

        }
    }
}
