package HDU._2k._20XX.HDOJ2018;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedInputStream cin = new BufferedInputStream(System.in);

        int year;
        int[] cows = new int[4];

        while (true) {
            year = in.nextInt();
            if (0 == year) {
                break;
            }

            cows[0] = 1; cows[1] = 0; cows[2] = 0; cows[3] = 0;
            while (year-->1) {
                cows[0] += cows[3]; cows[3]=cows[2]; cows[2]=cows[1]; cows[1]=cows[0];
            }

            out.println(cows[0]+cows[1]+cows[2]+cows[3]);
        }

        in.close();
    }
}
