package learningObjects;

public class LearningConcatmethod {
    public static void main(String[] args) {
        String tech= "Tech";
        String global= "Global";
        String choolName= "Tech"+"Global";
        String schoolName2= global.concat(global);

    System.out.println(schoolName2+ "\n" + choolName);
        String myName= "Alona";
        String myLastNme= "Fomina";
        String initials= myName+ " " +myLastNme;
        String initials2= "Alona Fomina";
        String initials3= myName+ " " + myLastNme;
        String initials4= myName +" ".concat(myLastNme);


        System.out.println(initials);
        System.out.println(initials2);
        System.out.println(initials3);
        System.out.println(initials4);
        System.out.println("My name is "+initials2);
        String studentName= "Regina";


        System.out.println(studentName+ "is sleeping."+ studentName+" is coding. Kaly is eating");



    }
}
