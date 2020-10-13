package HDU._1K._18xx.HDOJ1859;

/*
X B
A X
 */

import java.lang.*;
import java.io.*;
import java.nio.*;
import java.math.*;
import java.util.*;
import java.text.*;
import java.net.*;

public class Main {
    private static class Point {
        public int x, y;

        public Point() {
            x = 0;
            y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }

    private static boolean isZero(Point p) {
        return 0 == p.x && 0 == p.y;
    }
    private static boolean isMAX(Point p) {
        return Integer.MAX_VALUE == p.x && Integer.MAX_VALUE == p.y;
    }
    private static boolean isMIN(Point p) {
        return Integer.MIN_VALUE == p.x && Integer.MIN_VALUE == p.y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ln = System.lineSeparator();

        Point A = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Point B = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
        Point p = new Point();

        while (in.hasNext()) {
            p.x = in.nextInt();
            p.y = in.nextInt();

            if (isZero(p)) {
                if (isMAX(A) && isMIN(B))
                    break;

                System.out.println(A + " " + B);
                A.x = A.y = Integer.MAX_VALUE;
                B.x = B.y = Integer.MIN_VALUE;
            } else {
                if (p.x < A.x) {
                    A.x = p.x;
                }
                if (p.y < A.y) {
                    A.y = p.y;
                }

                if (p.x > B.x) {
                    B.x = p.x;
                }
                if (p.y > B.y) {
                    B.y = p.y;
                }
            }
        }

        in.close();
    }
}