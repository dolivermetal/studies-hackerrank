package br.com.doliver.algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[Integer.valueOf(size)];

        int i = 0;
        while (in.hasNext()) {
            numbers[i] = Integer.valueOf(in.next());
            i++;
        }

        int sum = 0;
        for (int j = 0; j < numbers.length; j++)
            sum += numbers[j];
        System.out.print(sum);
    }
}