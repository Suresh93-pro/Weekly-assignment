import java.util.Arrays;
import java.util.Scanner;

public class level2q1 {
    static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    static int sum(int[] arr) {
        int s = 0; for (int x : arr) s += x; return s;
    }

    static int product(int[] arr) {
        int p = 1; for (int x : arr) p *= x; return p;
    }

    static int sumSquares(int[] arr) {
        int s = 0; for (int x : arr) s += Math.pow(x, 2); return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = getFactors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Sum of Squares: " + sumSquares(f));
    }
    
}
