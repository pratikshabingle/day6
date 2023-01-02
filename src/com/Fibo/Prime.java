package com.Fibo;

import java.util.Scanner;

public class Prime {
    public static void main(String a[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scanner.nextInt();
        int count=0;
        for(int i=2; i<number/2; i++){
            if(number%i==0)
            {
                count++;
            }
        }

        if(count == 0)
        {
            System.out.println("The Number is Prime Number.");
        }else {
            System.out.println("The Number is not Prime Number.");
        }
    }
}
