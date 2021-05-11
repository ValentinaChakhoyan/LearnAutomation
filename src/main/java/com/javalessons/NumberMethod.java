package com.javalessons;

public class NumberMethod {
    public static void main(String[] args) {
        System.out.println(CountSum(2));
        System.out.println(AverageNum(3));
    }

    public static int CountSum (int max) {
        int sum = 0;
        for (int i=1;i<=max;i++){
            sum += i;
        }
         return  sum;
    }

    public static int AverageNum (int max) {
        int sum = CountSum(max);
        int num = sum / max;

        return num;
    }
}
