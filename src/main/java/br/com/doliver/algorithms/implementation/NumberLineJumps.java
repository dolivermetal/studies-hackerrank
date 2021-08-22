package br.com.doliver.algorithms.implementation;

import java.io.*;

public class NumberLineJumps {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1 - Kangaroo 1 position
     *  2. INTEGER v1 - Kangaroo 1 jump distance
     *  3. INTEGER x2 - Kangaroo 2 position
     *  4. INTEGER v2 - Kangaroo 2 jump distance
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String possible = "NO";
        int kAhead, jAhead, kBehind, jBehind = 0;
        if(x1 > x2) {
            kAhead = x1;
            jAhead = v1;
            kBehind = x2;
            jBehind = v2;
        } else {
            kAhead = x2;
            jAhead = v2;
            kBehind = x1;
            jBehind = v1;
        }

        while(kAhead > kBehind) {
            kAhead += jAhead;
            kBehind += jBehind;
            if (kAhead == kBehind)
                possible = "YES";
        }

        return possible;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);
        int v1 = Integer.parseInt(firstMultipleInput[1]);
        int x2 = Integer.parseInt(firstMultipleInput[2]);
        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
