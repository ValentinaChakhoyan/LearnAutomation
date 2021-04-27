package com.javalessons;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My first number: ");
        int num1 = scanner.nextInt();
        System.out.println("My second number: ");
        int num2 = scanner.nextInt();
        System.out.println("My third number: ");
        int num3 = scanner.nextInt();

        if(num1 >= num2 && num1 >= num3 ){
            System.out.println(num1+" is the largest number");
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println(num2+" is the largest number");
        }
        else{
            System.out.println(num3+" is the largest number");
        }
    }
    
}
