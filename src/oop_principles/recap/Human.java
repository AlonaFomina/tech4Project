package oop_principles.recap;

public class Human {

    static {
        System.out.println("Earth is existing");
    }

    {
        System.out.println("Human is created");
    }



    public Human(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Human(String name,
                 int age,
                 String race,
                 String ethnicity,
                 char gender,
                 String skinColor,
                 String hairColor,
                 String eyeColor,
                 String bodyType,
                 double weight,
                 double height,
                 boolean isRussian) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.bodyType = bodyType;
        this.weight = weight;
        this.height = height;
        this.isRussian = isRussian;
    }


    public String name;
    public int age;
    public String race;
    public String ethnicity;
    public char gender;
    public String skinColor;
    public String hairColor;
    public String eyeColor;
    public String bodyType;
    public double weight;
    public double height;
    public boolean isRussian;
    public static String haveBrain = "having brain";
    public static boolean digestingFood = true;
    public static boolean haveIntellect = true;

    public void canBuyAlcohol(){
        System.out.println(age>=21 ?
        "You are able to buy and drink alcohol":
                "You are underage");
    }

    public boolean nameStartsWithA(){
         return name.toLowerCase().startsWith("a");
    }

    public void hasHumaRights() {
        System.out.println(isRussian ? "having no human rights" : "deserve to live");
    }

    public static void breathing() {
        System.out.println("Every human breath oxygen");
    }

    public static void havingParents() {
        System.out.println("Was created by 2 people");
    }

    @Override
    public String toString() {
        return "Human{" +
                (name == null ? "" : "name='" + name + '\'') +
                (age == 0 ? "" : ", age=" + age) +
                (race == null ? "" : ", race='" + race + '\'') +
                (ethnicity == null ? "" : ", ethnicity='" + ethnicity + '\'') +
                (gender == '\u0000' ? "" : ", gender=" + gender) +
                (skinColor == null ? "" : ", skinColor='" + skinColor + '\'') +
                (hairColor == null ? "" : ", hairColor='" + hairColor + '\'') +
                (eyeColor == null ? "" : ", eyeColor='" + eyeColor + '\'') +
                (bodyType == null ? "" : ", bodyType='" + bodyType + '\'') +
                (weight == 0.0 ? "" : ", weight=" + weight) +
                (height == 0.0 ? "" : ", height=" + height) +
                ", isRussian=" + isRussian +
                '}';
    }


}
