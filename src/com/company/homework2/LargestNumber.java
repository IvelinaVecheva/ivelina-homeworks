package com.company.homework2;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {10, 20, 25, 63, 96, 57, -5};
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println(max);
    }
}
