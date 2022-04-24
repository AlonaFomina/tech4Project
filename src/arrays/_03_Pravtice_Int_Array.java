package arrays;

import utilities.MathHelper;

import java.util.Arrays;

public class _03_Pravtice_Int_Array {
    public static void main(String[] args) {

        System.out.println("_________________Task-1_________________");

        int[] ints = { -3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted = " + Arrays.toString(ints));

        Arrays.sort(ints);
        System.out.println("Array is sorted = " + Arrays.toString(ints));

        System.out.println("_________________Task-2_________________");

        int pos = 0, neg = 0,zero = 0;
        for (int anInt : ints) {
           if(anInt < 0) neg++;
           else if (anInt > 0) pos++;
           else zero++;

            }
        System.out.println("Positive = " + pos +
                "\nNegative = " + neg +
                "\nZeros = " + zero);

        System.out.println("_________________Task-3_________________");

        int even = 0, odd = 0;
        for (int anInt : ints) {
            if(anInt % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Evens = " + even +
                "\nOdds = " + odd);


        }
    }
