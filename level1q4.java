import java.util.Scanner;

public class level1q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double arr[] = new double[10];
        double sum = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0)
                break;

            if (index == 10)
                break;

            arr[index] = num;
            index++;
        }

        // Display values and sum
        for (int i = 0; i < index; i++) {
            System.out.println("Value: " + arr[i]);
            sum += arr[i];
        }

        System.out.println("Total Sum = " + sum);
    }

    
}
