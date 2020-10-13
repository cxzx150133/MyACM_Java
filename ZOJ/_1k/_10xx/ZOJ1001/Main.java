package ZOJ._1k._10xx.ZOJ1001;

//
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();

            System.out.println(a+b);
        }

        input.close();
    }
}