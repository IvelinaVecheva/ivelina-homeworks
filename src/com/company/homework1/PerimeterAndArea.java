package com.company.homework1;

import java.util.Scanner;

public class PerimeterAndArea {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        double perimeter;

        System.out.println("Въведете страна А: ");
        double sideA = myScanner.nextDouble();

        System.out.println("Въведете страна B: ");
        double sideB = myScanner.nextDouble();

        System.out.println("Въведете страна C: ");
        double sideC = myScanner.nextDouble();

        perimeter = sideA + sideB + sideC;
        System.out.println("Периметърът е: " + perimeter);

        double s = perimeter/2;
        //Heron formula
        double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

        System.out.println("Площта е: " + area);
    }
}
