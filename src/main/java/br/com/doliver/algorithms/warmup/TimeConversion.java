package br.com.doliver.algorithms.warmup;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();

        try {
            SimpleDateFormat sdfIn = new SimpleDateFormat("hh:mm:ssa");
            SimpleDateFormat sdfOut = new SimpleDateFormat("HH:mm:ss");
            System.out.println(sdfOut.format(sdfIn.parse(time).getTime()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}