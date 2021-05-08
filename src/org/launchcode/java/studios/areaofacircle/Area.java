package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        double r = input.nextDouble();
        //double pi = 3.14;
        //double area = pi * r * r;

        double area = Circle.getArea(r);

        System.out.println("The area of a circle of radius" + r + " is: " + area);
    }
}
