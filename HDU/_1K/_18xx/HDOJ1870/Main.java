package HDU._1K._18xx.HDOJ1870;

//因为 ”你可以假设，每个透视图画的都是合法的。“ 所以说打开+1关闭-1直到碰到礼物B就完事了。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count;

        while (input.hasNext()) {
            char[] line = input.next().toCharArray();
            count = 0;

            for (char c : line) {
                if (c=='(') {
                    count++;
                } else if (c==')') {
                    count--;
                } else { // B
                    break;
                }
            }

            System.out.println(count);
        }

        input.close();
    }
}
