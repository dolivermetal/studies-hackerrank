package br.com.doliver.algorithms.warmup;

import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> line = new ArrayList<>();
        Map<Integer, List<Integer>> lineMap = new HashMap<>();

        int i = 0;
        int j = 1;
        int k = size;
        int x1 = 0, x2 = 0;
        while(in.hasNext()) {
            int tmp = in.nextInt();
            i++;

            if (i==j)
                x1 += tmp;

            if (i==k)
                x2 += tmp;

            if (i==size) {
                j++;
                i = 0;
                k--;
            }
        }
        System.out.println(Math.abs(x1 - x2));
    }
}
