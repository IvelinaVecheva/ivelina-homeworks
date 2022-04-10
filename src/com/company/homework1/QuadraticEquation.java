package com.company.homework1;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Въведете a: ");
        double a = myScanner.nextDouble();

        System.out.println("Въведете b: ");
        double b = myScanner.nextDouble();

        System.out.println("Въведете c: ");
        double c = myScanner.nextDouble();

        double diskriminanta = Math.sqrt(b*b - 4*a*c);

        double x1 = (-b + diskriminanta)/2*a;
        System.out.println("x1: " + x1);

        double x2 = (-b - diskriminanta)/2*a;
        System.out.println("x2: " + x2);
    }
}
