package org.example.cs146;
import org.example.Main;

public class Cs146 {
    public static int mystery(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x += a[i] * a[i];

        }
        return x;
    }

    public static int[][] mystery2(int n, int k) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i == j ? k : 0;
                System.out.print(a[i][j] + ", ");
                if (j == n - 1) {
                    System.out.println();
                }
            }

        }
        return a;
    }

    public static int mystery3(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (a == 0) {
            return mystery3(b - 1, a);

        }
        return b + mystery3(b, a - 1);
    }

    public static void calculateCircle() {
        double r = 5.0;
        double c = 2 * Math.PI * r;
        double a = Math.PI * r * r;
        System.out.printf(" radius = %.2f , circumference = %.2f , area = %.2f", r, c, a);

    }

}