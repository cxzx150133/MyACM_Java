package HDU._1K._10xx.HDOJ1002;

// Print A+B
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ln = System.lineSeparator();

        int N = 0; // line number.
        if (input.hasNext())
            N = input.nextInt();

        for (int i=1;i<=N && input.hasNext();i++) {
            String a = input.next();
            String b = input.next();
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            BigInteger C = A.add(B);

            System.out.printf("Case %d:"+ln+ "%s + %s = %s%n", i, A, B, C);
            if (i!=N)
                System.out.println();
        }
        input.close();
    }
}
