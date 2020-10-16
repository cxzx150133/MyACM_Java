package HDU._1K._10xx.HDOJ1058;

/*
  除 H[1]=1 ，H[i]:
  状态转移方程 H[i] = Min(H[N2]*2, H[N3]*3, H[N5]*5, H[N7]*7)
  求第 N 个 Humber Number 是和第 N-1 个 Humber Number 有关系
  -> 问题的最优解可以用子问题的最优解来解决(DP)

  1 1x2(N2->2) 1x3(N3->2) 2x2(N2->3) 1x5(N5->2) 3x2 1x7(N7->2) ...
  每次有四种选择，取最小的作为下一个的值。
 */
import java.lang.*;
import java.io.*;
import java.nio.*;
import java.math.*;
import java.util.*;
import java.text.*;
import java.net.*;

public class Main {
    private static String suffix(int n) {
        String[] s = {"st", "nd", "rd", "th"}; // loop
        // patch
        if (n%100 == 11 || n%100 == 12 || n%100 == 13) {
            return "th";
        }
        switch (n%10) {
            case 1:return "st";
            case 2:return "nd";
            case 3:return "rd";
            default:return "th";
        }
    }

    private static final int[] H = new int[5842+1];
    private static int n2, n3, n5, n7;
    private static int minimum(int a, int b, int c, int d) {
        int r = a;
        if (b<r) r = b;
        if (c<r) r = c;
        if (d<r) r = d;

        if (r == a) n2++;
        if (r == b) n3++;
        if (r == c) n5++;
        if (r == d) n7++;

        return r;
    }
    private static void init() {
        H[1] = 1;
        n2 = n3 = n5 = n7 = 1;
        for (int i=2;i<=5842;i++) {
            H[i] = minimum(H[n2]*2, H[n3]*3, H[n5]*5, H[n7]*7);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedInputStream cin = new BufferedInputStream(System.in);

        String ln = System.lineSeparator();

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(2000000000);

        init();

        while (in.hasNext()) {
            int N = Integer.parseInt(in.next());

            if (0==N) {
                break;
            }

            System.out.printf("The %d%s humble number is %d."+ln, N, suffix(N), H[N]);
        }

        in.close();
    }
}
