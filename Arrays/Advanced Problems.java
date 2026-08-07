/*
CSES: Number Spiral

Difficulty: Easy

Pattern: Pattern Recognition + Math

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long y = sc.nextLong();
            long x = sc.nextLong();

            long ans;

            if (y > x) {
                if (y % 2 == 0) {
                    ans = y * y - x + 1;
                } else {
                    ans = (y - 1) * (y - 1) + x;
                }
            } else {
                if (x % 2 == 0) {
                    ans = (x - 1) * (x - 1) + y;
                } else {
                    ans = x * x - y + 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
*/