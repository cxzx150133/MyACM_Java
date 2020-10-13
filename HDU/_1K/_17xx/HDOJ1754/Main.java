package HDU._1K._17xx.HDOJ1754;

// AC,But 8221MS	23664K
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedInputStream cin = new BufferedInputStream(System.in);

        while (in.hasNext()) {
            int N = Integer.parseInt(in.next()); // students number
            int M = Integer.parseInt(in.next()); // operations number
            int[] score = new int[N+1];
            // get student`s score
            for (int i=1;i<=N;i++) {
                score[i] = Integer.parseInt(in.next());
            }

            // start exec operations list
            for (int i=0;i<M;i++) {
                String Opera = in.next();
                int A = Integer.parseInt(in.next());
                int B = Integer.parseInt(in.next());
                int left  = Math.min(A, B);
                int right = Math.max(A, B);
                if (Opera.equals("Q")) { // query
                    int max = -1;
                    for (int j=left;j<=right;j++) {
                        if (score[j]>max) {
                            max = score[j];
                        }
                    }
                    System.out.println(max);
                } else { // U: update
                    score[A] = B;
                }
            }
        }
        in.close();
    }
}