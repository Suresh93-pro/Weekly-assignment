import java.util.Scanner;

public class level3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Step 1: Count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int digits[] = new int[count];
        int freq[] = new int[10]; // 0–9 digits

        // Step 2: Store digits in array
        int index = 0;
        while (num != 0) {
            digits[index] = num % 10;
            freq[digits[index]]++; // increase frequency
            num = num / 10;
            index++;
        }

        // Step 3: Display frequency
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }

}
