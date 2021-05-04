package com.javalessons;
import java.util.Scanner;
import java.util.Arrays;
public class InputIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();
        String convertedInput = String.valueOf(userInput);
            int []array = new int [convertedInput.length()];
            for (int i= array.length-1; i>=0; i--){
                array[i] = userInput %10;
                userInput = userInput/10;
            }
        System.out.println(Arrays.toString(array));

    }
}
