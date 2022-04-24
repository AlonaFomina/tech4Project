package MathClass;

public class findRandom {
    public static void main(String[] args) {
        double random = Math.random();
      int randomBetween0And1Included = (int) (Math.random() * 11);

        System.out.println(random);
        System.out.println(randomBetween0And1Included);

        int randomBetween0And20included = (int) (Math.random() * 21);
        System.out.println(randomBetween0And20included);

        int randomBetween10And20included = (int) (Math.random()*(11) + 10);
        System.out.println(randomBetween10And20included);

        int randomLarge = (int) (Math.random()* (224) + 103);
        System.out.println(randomLarge);

        int randomMinus = (int) ((Math.random()* 101) - (-50));
        System.out.println(randomMinus);
    }
}
