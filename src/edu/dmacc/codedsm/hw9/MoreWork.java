package edu.dmacc.codedsm.hw9;

import java.util.ArrayList;
import java.util.Random;

public class MoreWork {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "Fizzbuzz";

    public static void main(String[] args) {
        ArrayList<Integer> integers = generateIntegers(20);
        ArrayList<String> strings = new ArrayList<>();

        for (int i : integers) {
            if (i % 3 == 0 && i % 5 == 0) {
                strings.add(FIZZBUZZ);
            } else if (i % 3 == 0) {
                strings.add(FIZZ);
            } else if (i % 5 == 0) {
                strings.add(BUZZ);
            } else

                strings.add("Number " + i + " is not fizzy");
        }
        System.out.println(strings);
    }

    public static ArrayList<Integer> generateIntegers(int size) {
        ArrayList<Integer> xs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            xs.add(Math.abs(random.nextInt(Integer.MAX_VALUE - 1) + 1));
        }
        return xs;
    }
}






