import java.util.Arrays;
import java.util.Random;

public class level3q1 {
    static int sum(int[] arr) {
        int s = 0; for (int x : arr) s += x; return s;
    }

    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int shortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    static int tallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150–250
        }
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean: " + mean(heights));
    }
    
}
