package com.company;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println( "i = " + i + " and j = " + j); // i = 10 and j = 20

        int temp = i;
        i = j;
        j = temp;
        System.out.println( "i = " + i + " and j = " + j); // i = 20 and j = 10
    }
}
