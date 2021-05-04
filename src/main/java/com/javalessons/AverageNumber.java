package com.javalessons;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        double total = 0;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the length of the array");
        double[] arr = new double[10];
        for (int i=0; i< arr.length; i++) {
            System.out.println("Please enter value for array [ " +i+ " ] ");
            arr[i]= scanner.nextDouble();
        }

        for(int i=0; i<arr.length; i++){
            total += arr[i];
            }

        double average = total / arr.length;
        System.out.println("Average is " +average);
    }
}