package com.javalessons;
import java.util.Scanner;

public class IsInputExists {
    public static void main(String[] args) {
        int[] array = {10, 12, 15, 19, 21, 29, 35};
        System.out.print("Please input a number to check if that exists in the array");
       Scanner scanner = new Scanner(System.in);
       int userInput = scanner.nextInt();
       boolean isExists = false;
       for ( int number:array){
           if(number == userInput) {
               isExists = true;
               System.out.println("The entered number exists in the array");
               break;
           }
       }
       if(!isExists){
           System.out.println("The entered number does not exist in the array");
       }

    }
}
