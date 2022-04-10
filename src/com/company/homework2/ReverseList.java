package com.company.homework2;

public class ReverseList {

    public static void main(String[] args) {
        int list1[] = {2, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int j = list1.length;
        int[] a = new int[j];

        for(int i=0; i<list1.length; i++){

            a[j-1] = list1[i];
            j = j-1;
        }

        for (int k = 0; k < list1.length; k++) {
            System.out.println(a[k]);
        }
    }
}
