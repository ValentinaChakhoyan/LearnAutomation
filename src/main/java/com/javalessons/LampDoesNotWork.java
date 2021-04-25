package com.javalessons;

public class LampDoesNotWork {
    public static void main(String[] args) {
        boolean lampPluggedOff = true;
        boolean bulbburnedout = false;
        if (lampPluggedOff) {
            if (bulbburnedout) {
                System.out.println("Replace bulb");
            } else {
                System.out.println("Repair bulb");
            }
        } else {
            System.out.println("Plug in Lamp");
        }
    }


}