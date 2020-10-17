package HDU._1K._10xx.HDOJ1003;


/*
    S1 = a[1];
    Sn = Sn-1>=0?Sn-1+a[n]:a[n]
 */
import java.lang.*;
import java.io.*;
import java.nio.*;
import java.math.*;
import java.util.*;
import java.text.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  ln = System.lineSeparator();

        int T = in.nextInt(); // (1<=T<=20)
        int c = 0;
        while (T-->0) {
            int N = in.nextInt(); // (1<=N<=100000)
            int sum = 0, max = -1000, start = 0, end = 0, temp = 1;
            for (int i=1;i<=N;i++) {
                int n = Integer.parseInt(in.next()); // between -1000 and 1000
                sum += n;

                if (sum>max) {
                    max = sum;
                    start = temp;
                    end = i;
                }

                if (sum<0) {
                    sum = 0;
                    temp = i+1;
                }
            }
            System.out.printf("Case %d:"+ln+"%d %d %d"+ln, ++c, max, start, end);
            if (T != 0) {
                System.out.println();
            }
        }

        in.close();
    }
}