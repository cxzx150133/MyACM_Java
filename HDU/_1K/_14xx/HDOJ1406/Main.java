package HDU._1K._14xx.HDOJ1406;

// test: 1 1 10000
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedInputStream cin = new BufferedInputStream(System.in);

        int group = in.nextInt();

        for (int i=0;i<group;i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            int left = Math.min(num1, num2);
            int right= Math.max(num1, num2);

            int count = 0;
            for (int j=left;j<=right;j++) {
                if (isPerfect(j)) {
                    count++;
                }
            }

            out.println(count);
        }

        in.close();
    }
    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int i=2;i<=n/2;i++) {
            if (n%i==0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
