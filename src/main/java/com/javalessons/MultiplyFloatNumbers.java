package com.javalessons;
        import java.util.Scanner;
public class MultiplyFloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the first number: ");
        Float number1 = scanner.nextFloat();
        System.out.println("Put the second number: ");
        Float number2 = scanner.nextFloat();
        Float multiply = number1 * number2;
        System.out.println("The output is: "+multiply);
    }
}

