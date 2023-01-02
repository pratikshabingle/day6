package com.Fibo;

import java.util.Scanner;

public class cupon {
    public long startTime = 0;
    public long endTime = 0;
    public long elaspsed;

    public void startTime() {

        startTime = System.currentTimeMillis();
        System.out.println("Starting Time" + startTime);
    }

    public void endTime() {

        endTime = System.currentTimeMillis();
        System.out.println("Ending Time" + endTime);
    }

    public long getElapsedTime() {
        elaspsed = endTime - startTime;
        return elaspsed;
    }

    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start time");
        sc.nextInt();
        st.startTime();

        System.out.println("Enter end time");
        sc.nextInt();
        st.endTime();


        long elaspsedTime = st.getElapsedTime();
        System.out.println("Total time elaspsed millisecond" + elaspsedTime);

        long sec = elaspsedTime / 1000;

        System.out.println("total elaspsed time in second" + sec);

        float minutes = (float) sec / 100;
        System.out.println("total elaspsed time in minutes" + minutes);
    }

}