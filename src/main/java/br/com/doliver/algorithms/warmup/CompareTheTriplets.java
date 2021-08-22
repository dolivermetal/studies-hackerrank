package br.com.doliver.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int alice = 0;
        int bob = 0;

        if (a0 > b0) alice += 1;
        else if (a0 < b0) bob += 1;

        if (a1 > b1) alice += 1;
        else if (a1 < b1) bob += 1;

        if (a2 > b2) alice += 1;
        else if (a2 < b2) bob += 1;

        return new int[]{alice, bob};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        String separator = "", delimiter = " ";
        for (Integer value : result) {
            System.out.print(separator + value);
            separator = delimiter;
        }
        System.out.println("");
    }
}

