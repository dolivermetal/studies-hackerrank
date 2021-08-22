package br.com.doliver.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int tallestCandle = 0;
        int countCandles = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (height[height_i] > tallestCandle) {
                tallestCandle = height[height_i];
                countCandles = 0;
            }

            if (height[height_i] == tallestCandle)
                countCandles++;
        }

        System.out.println(countCandles);
    }
}
