public class level3q2 {
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static boolean isDuck(int[] arr) {
        for (int d : arr) if (d == 0) return true;
        return false;
    }

    static boolean isArmstrong(int[] arr) {
        int len = arr.length, sum = 0;
        for (int d : arr) sum += Math.pow(d, len);
        int num = 0;
        for (int d : arr) num = num * 10 + d;
        return sum == num;
    }

    static void largestTwo(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : arr) {
            if (d > first) { second = first; first = d; }
            else if (d > second && d != first) second = d;
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    static void smallestTwo(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d < first) { second = first; first = d; }
            else if (d < second && d != first) second = d;
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + second);
    }

    public static void main(String[] args) {
        int n = 153; // example
        int[] digits = digitsArray(n);
        System.out.println("Count of digits: " + countDigits(n));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Duck? " + isDuck(digits));
        System.out.println("Armstrong? " + isArmstrong(digits));
        largestTwo(digits);
        smallestTwo(digits);
    }
    
}
