package com.javalessons;
import java.util.Scanner;
public class MultiplyIntNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Put the second number: ");
        int number2 = scanner.nextInt();
        int multiply = number1 * number2;
        System.out.println("The output is: "+multiply);
    }
}
