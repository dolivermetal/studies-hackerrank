package br.com.doliver.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        int nCount = 0;
        while(in.hasNext()) {
            numbers[nCount] = in.nextInt();
            nCount++;
        }

        long min = 0;
        long max = 0;
        long sum = 0;
        int total = 0;
        int ignored = 0;
        while (total < numbers.length) {
            total ++;
            sum = 0;
            ignored = numbers.length-1;
            for(int i = 0; i < numbers.length; i++) {
                ignored = numbers.length-total;
                if (ignored != i)
                    sum += numbers[i];
            }

            if (min == 0 || sum < min)
                min = sum;

            if (max == 0 || sum > max)
                max = sum;
        }
        System.out.println(min + " " + max);
    }
}
