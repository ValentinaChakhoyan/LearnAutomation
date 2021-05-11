package com.javalessons;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        int []Array = {10,20,30,40,50};
        System.out.print("Original array ");
        for(int i=0;i<Array.length;i++)
            System.out.print(Array[i] + "  ");
        System.out.println();
        System.out.println("The same array in reverse order:");
        for(int i=Array.length-1;i>=0;i--)
            System.out.print(Array[i] + "  ");
    }
}




