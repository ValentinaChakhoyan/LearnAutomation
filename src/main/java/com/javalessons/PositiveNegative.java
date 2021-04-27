package com.javalessons;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        if(number>0){
            System.out.println("The given number is positive");
        }
        else if(number<0){
            System.out.println("The given number is negative");
        }
    }
}
