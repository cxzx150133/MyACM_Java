package HDU._1K._10xx.HDOJ1021;

//
import java.lang.*;
import java.io.*;
import java.nio.*;
import java.math.*;
import java.util.*;
import java.text.*;
import java.net.*;

public class Main {

//    private static int F(int n) {
//        if (0==n) {
//            return 7;
//        } else if (1==n) {
//            return 11;
//        }
//
//        return F(n-1) + F(n-2);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedInputStream cin = new BufferedInputStream(System.in);

        String ln = System.lineSeparator();

//        for (int i=0;i<20;i++) {
//            System.out.printf("%3d %3s F:%8d %3s"+ln, i, (((i-2)%4 == 0)?"yes":"no"), F(i), ((F(i)%3 == 0)?"yes":"no"));
//        }

        while (in.hasNext()) {
            int N = Integer.parseInt(in.next());

            if ((N-2)%4 == 0) {
                out.println("yes");
            } else {
                out.println("no");
            }
        }

        in.close();
    }
}