package com.company.homework2;

public class DivisibleBy5 {
    public static void main(String[] args) {
        int list1[] = {2, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for(int i=0; i<list1.length; i++) {
            if (list1[i]%5 == 0){
                if(list1[i] > 150){
                    break;
                }
            System.out.println(list1[i]);
            }
        }
    }
}
