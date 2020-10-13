package HDU._1K._12xx.HDOJ1228;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedInputStream cin = new BufferedInputStream(System.in);

        String[] digit = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        HashMap<String, Integer> val = new HashMap<>();

        for (int i=0;i<digit.length;i++) {
            val.put(digit[i], i);
        }

        while (in.hasNext()) {
            int A = 0, B = 0;

            String word = in.next();
            while (!word.equals("+")) {
                A = A*10 + val.get(word);
                word = in.next();
            }

            word = in.next();
            while (!word.equals("=")) {
                B = B*10 + val.get(word);
                word = in.next();
            }

            if (A==0 && B==0) {
                break;
            }

            out.println(A+B);
        }

        in.close();
    }
}