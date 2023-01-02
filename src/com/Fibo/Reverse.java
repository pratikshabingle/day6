package com.Fibo;

import java.util.Scanner;

 public class Reverse{

    public static void main(String[] args)
    {
        int temp,r,rev=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("Reverse no is:-"+rev);
        }else
        {
            System.out.println("No is not reverse:"+rev);
        }
    }

}
