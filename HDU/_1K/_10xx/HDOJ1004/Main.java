package HDU._1K._10xx.HDOJ1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, max;
        String[] name = new String[1000];
        int[] count = new int[1000];

        n = input.nextInt();
        while (n>0&&n<=1000) {
            m = 0;max = 0;
            for (int i=0;i<n;i++) {
                name[i] = input.next();
                if (name[i].length()>15) continue;
                for (int j=0;j<i;j++) {
                    if (name[i].equals(name[j])) {
                        count[j]++;
                        if (j>m) {
                            m = j;
                        }
                    }
                }
                for(int j=0;j<m;j++) {
                    if (count[j]>count[max]) {
                        max = j;
                    }
                }
            }
            System.out.println(name[max]);
            n = input.nextInt();
        }
        input.close();
    }
}