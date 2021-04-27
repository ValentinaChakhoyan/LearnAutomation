package com.javalessons;

import java.util.Scanner;

public class MultiplyDoubleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the 1st number: ");
        double number3 = scanner.nextDouble();
        System.out.println("Put the 2nd number: ");
        double number4 = scanner.nextInt();
        double multiply = number3 * number4;
        System.out.println("The output is: "+multiply);
    }
}

