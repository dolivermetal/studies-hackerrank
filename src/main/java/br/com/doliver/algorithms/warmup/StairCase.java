package br.com.doliver.algorithms.warmup;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 1; i <= size; i++) {
            String text = "";
            text = complete(text, i, "#");
            text = complete(text, size, " ");
            System.out.println(text);
        }
    }

    static String complete(String text, int size, String complete) {
        while(text.length() < size) {
            text = complete + text;
        }
        return text;
    }
}