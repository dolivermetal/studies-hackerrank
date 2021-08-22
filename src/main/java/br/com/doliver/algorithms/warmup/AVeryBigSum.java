package br.com.doliver.algorithms.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> numbers = new ArrayList();
        while (in.hasNext()) {
            numbers.add(in.nextInt());
        }

        AtomicLong sum = new AtomicLong(0);
        numbers.forEach(n -> sum.addAndGet(n.longValue()));
        System.out.println(sum);
    }
}