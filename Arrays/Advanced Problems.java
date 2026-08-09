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

/*
CSES: Two Knights

Difficulty: Medium

Pattern: Math + Combinatorics

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int k = 1; k <= n; k++) {

            long total = (long) k * k * (k * k - 1) / 2;

            long attacking = 4L * (k - 1) * (k - 2);

            long answer = total - attacking;

            System.out.println(answer);
        }
    }
}
*/

/*
CSES: Tower of Hanoi

Difficulty: Easy

Pattern: Recursion

import java.util.*;

public class Main {

    static void hanoi(int n, int from, int to, int aux) {

        if (n == 0) {
            return;
        }

        hanoi(n - 1, from, aux, to);

        System.out.println(from + " " + to);

        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long moves = (1L << n) - 1;

        System.out.println(moves);

        hanoi(n, 1, 3, 2);
    }
}
*/