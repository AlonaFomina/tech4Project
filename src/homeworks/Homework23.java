package homeworks;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        shoppingList.put("Apple", 3);
        shoppingList.put("Mango", 5);
        // shoppingList.put("Orange", 3);
//        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        System.out.println(calculateTotalPrice2(shoppingList));
    }

    //Task-1

    public static Map<Integer, String> parseData(String data) {
        TreeMap<Integer, String> collection = new TreeMap<>();
        String[] newData = data.split("\\{");
        for (String newDatum : newData) {
            System.out.println(newDatum);
            if (!newDatum.isEmpty())
                //parse
                collection.put(Integer.valueOf(newDatum.substring(0, newDatum.indexOf('}'))), newDatum.substring(newDatum.indexOf('}') + 1));
        }
        return collection;
    }

    //Task-2

    public static double calculateTotalPrice1(Map<String, Integer> gross) {
        double totalPrice = 0;
        Map<String, String> prices = new HashMap<>();
        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        prices.put("Pineapple", "$5.25");
        for (String product : gross.keySet())
            for (int i = 0; i < gross.get(product); i++)
                totalPrice += Double.parseDouble(prices.get(product).substring(1));
        return (double) Math.round(totalPrice * 100) / 100;
    }

    //Task-3

    public static double calculateTotalPrice2(Map<String, Integer> gross) {
        double totalPrice = 0;
        int shoppingCartApple = 0;
        int shoppingCartMango = 0;
        Map<String, String> prices = new HashMap<>();
        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        prices.put("Pineapple", "$5.25");
        for (String product : gross.keySet()) {
            for (int i = 0; i < gross.get(product); i++) {
                if (product.equals("Apple") && i % 2 != 0)
                    totalPrice += Double.parseDouble(prices.get(product).substring(1)) * 0.50;
                else if (product.equals("Mango") && i % 4 == 3) continue;
                else totalPrice += Double.parseDouble(prices.get(product).substring(1));
            }
        }
        return (double) Math.round(totalPrice * 100) / 100;
    }
}
