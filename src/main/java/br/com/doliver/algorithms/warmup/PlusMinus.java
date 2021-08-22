package br.com.doliver.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        double negative = 0;
        double positive = 0;
        double neutral = 0;
        while(in.hasNext()) {
            int number = in.nextInt();
            if (number < 0) negative++;
            else if (number > 0) positive++;
            else neutral++;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(positive/size));
        System.out.println(df.format(negative/size));
        System.out.println(df.format(neutral/size));
    }
}