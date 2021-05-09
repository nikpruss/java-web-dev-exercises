package exercises.chapter3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class ArrayPractice {
    public static void main(String[] args){
        int[] array = {1, 1, 2, 3, 5, 8};

        for (int i : array){
            System.out.println(i);
        }

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String [] split = phrase.split(" ");
        for (String j : split) {
            System.out.println(j);
        }
        System.out.println(Arrays.toString(split));

        String [] sentance = phrase.split("\\.");
        for (String j : sentance) {
            System.out.println(j);
        }
        System.out.println(Arrays.toString(sentance));

    }
}
