package HDU._1K._10xx.HDOJ1001;

// Print 1+2+...+(N-1)+N
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ln = System.lineSeparator();

        int n, sum;

        while (input.hasNext()) {
            n = input.nextInt();
            sum = f_(n);

            System.out.println(sum+ln);
        }

        input.close();
    }
    // AC 327MS	9384K
    private static int f(int x) {
        int sum = 0;
        for (int i=1;i<=x;i++)
            sum += i;
        return sum;
    }
    // AC 312MS	9372K
    private static int f_(int n) {
        return (int)((1+n)*n/2.0); // Sum of Arithmetic Sequence By:Gauss
    }
}