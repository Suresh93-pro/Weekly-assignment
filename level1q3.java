import java.util.Scanner;

public class level1q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int table[] = new int[10];

        // Store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        // Display
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }

    
}
