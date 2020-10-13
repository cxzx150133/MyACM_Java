package HDU._1K._14xx.HDOJ1402;

//
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
            BigInteger A = new BigInteger(in.next());
            BigInteger B = new BigInteger(in.next());

            cout.println(A.multiply(B).toString());
            cout.flush();
        }

        in.close();
    }
}
