public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10; // example
        int rec = recursiveSum(n);
        int form = formulaSum(n);
        System.out.println("Recursive Sum: " + rec);
        System.out.println("Formula Sum: " + form);
        System.out.println("Equal? " + (rec == form));
    } {
    
}
