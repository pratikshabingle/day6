package com.Fibo;

import java.util.Scanner;

public class perfect {

    public static void main(String[] args)
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        n=sc.nextInt();
        int i=1;
        while( i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println(" perfect no");
        }else
            System.out.println("not perfect no");

    }

}
