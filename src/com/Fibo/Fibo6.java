package com.Fibo;

public class Fibo6 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0, b = 1;
        scanner
                sc = new scanner(System.in);
        System.out.println("Enter no:");
        int
                num = sc.nextInt();

        System.out.println("" + a + "\n" + b);
        while (sum < num) {
            sum = a + b;
            if (sum >= num)
                break;
            System.out.println("" + sum);
            a = b;
            b = sum;


        }

    }

}