package com.company.homework2;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {
        double revenue, discountPrice;
        double price = 0;
        double discount = 0;
        int quantity = 0;

        try {
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter price: ");
            price = myScanner.nextDouble();

            System.out.println("Enter quantity: ");
            quantity = myScanner.nextInt();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (quantity <= 0 || price <= 0) {
            System.out.println("Невалидна цена и/или количество");
        }

        if (quantity > 0 && quantity < 100)
            discount = 0;
       else if((quantity >= 100 && quantity <= 120)){
            discount = 0.15;
        }
      else if(quantity > 120)
            discount = 0.2;


        revenue = (1-discount)*quantity*price;
        discountPrice = discount*quantity*price;

        System.out.println("The revenue from sale: " + revenue);
        System.out.println("Discount: " + discountPrice + " (" + discount*100 + "%)");

        }
    }

