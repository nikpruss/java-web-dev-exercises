package exercises.chapter2;

import java.util.Scanner;

public class NumericTypes {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double length = input.nextDouble();

        System.out.println("Enter width of rectangle");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle is " + area);

    }
}
