package org.launchcode.java.studios.countingcharacters;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class Count {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");

        String myString = input.nextLine();
        //System.out.println(myString);

        char[] charactersInString = myString.toCharArray();
        ArrayList<Character> myChar = new ArrayList<>();
        ArrayList<Integer> myCount = new ArrayList<>();
        int index;

        for (char i : charactersInString) {
            if (!myChar.contains(Character.toLowerCase(i))) {
                myChar.add(Character.toLowerCase(i));
                myCount.add(1);
            } else {
                index = myChar.indexOf(i);
                myCount.set(index, myCount.get(index) + 1);
            }
        }
        System.out.println(myChar);
        for (char j : myChar){
            System.out.println(j +": " + myCount.get(myChar.indexOf(j)));
        }
    }
}
