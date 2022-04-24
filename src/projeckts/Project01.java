package projeckts;

public class Project01 {
    public static void main(String[] args) {

        //Task-1
       String myName= "Alona";
       String myLastName= "Fomina";

    System.out.println(myLastName+" "+myLastName);

    //Task-2


        String myNameCharacter1= "A";
        String myNameCharacter2="l";
        String myNameCharacter3="o";
        String myNameCharacter4= "n";
        String myNameCharacter5 ="a";

        System.out.println(myNameCharacter1+myNameCharacter2+myNameCharacter3+myNameCharacter4+myNameCharacter5);
        System.out.println(myNameCharacter1+"\n"+myNameCharacter2+"\n"+myNameCharacter3+"\n"+myNameCharacter4
                +"\n"+myNameCharacter5);

        //Task-3

        String myFavMovie= "\"The Great Gatsby\"";
        String myFavSong= "Michael Jackson \"Billie Jeans\" ";
        String myFavCity = "Chicago";
        String myFavActivity= "hiking";
        String myFavSnack= "fruits";

        System.out.println("Hello people. My name is "+myName+" "+myLastName+". "+
                "I live in "+ myFavCity+". "+
                "I like 80 th music and my favorite song is "+myFavSong+". "+
                "I also like to watch some great movie, especially "+myFavMovie+". "+
                "When I do some activity it's usually  chose "+myFavActivity+
                ", and as a snack i always kerry some "+myFavSnack+".");


/*TASK-4

TASK-6
-Create a boolean called isWeatherNiceToday
-Assign true to this variable if it is above 60F today
-Assign false to this variable if it is below or equal to 60F today
-Print variable value with a proper message using println() method*/

        //Task-4
        int myFavNumber= 13,numberOfStatesIVisited= 6,numberOfCountriesIVisited= 3;

        System.out.println("My favorite number is "+myFavNumber+". "+
                "I had visited only "+numberOfCountriesIVisited+
                " countries so far, but I would like to travel all over the world. "+
                "Number of states i had visited is "+numberOfStatesIVisited+" and I would like to see more.");

        //Task-5
        boolean amIAtSchoolToday= !true;
        System.out.println(amIAtSchoolToday+" I had been study in campus today.");

        //Task-6
        boolean isWeatherNiceToday=false;
        System.out.println("Today is 52F. Weather so nice today. "+isWeatherNiceToday);


    }
}
