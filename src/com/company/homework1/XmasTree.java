package com.company.homework1;

import java.util.Scanner;

public class XmasTree {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Въведете големина на дървото: ");
        int size = myScanner.nextInt();

        for (int i = 0; i <= size; i++) {

            for (int j=size - i; j > 0; j--){

                System.out.print(" ");
            }
            for (int n=0; n<=i ;n++){

                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
