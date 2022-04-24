package oop_principles.recap;

public class testingPeople {

    public static void main(String[] args) {

        Human human1 = new Human("Dasha", 27, "White", "Ukrainian",
                'F', "White", "Brown", "Green", "Skinny",
                130.0, 5.5, false);
        System.out.println(human1);
        Human.breathing();
        Human.havingParents();
        human1.hasHumaRights();
        human1.canBuyAlcohol();
        System.out.println(human1.nameStartsWithA());
        System.out.println();

        Human human2 = new Human("Salih", 22, 190.0, 6.1);
        System.out.println(human2);
        System.out.println();
        Human.breathing();
        Human.havingParents();
        human2.hasHumaRights();

        Human human3 = new Human("Alona", 27,127.0,5.7);
        System.out.println(human3);
        System.out.println();
        Human.breathing();
        Human.havingParents();
        human3.hasHumaRights();
    }
}
