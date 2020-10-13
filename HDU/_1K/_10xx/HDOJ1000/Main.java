package HDU._1K._10xx.HDOJ1000;

// Print A+B
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        while (input.hasNext()) {
            a = Integer.parseInt(input.next());
            b = Integer.parseInt(input.next());

            System.out.println(a+b);
        }

        input.close();
    }
}