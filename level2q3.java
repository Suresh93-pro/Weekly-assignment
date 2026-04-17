import java.util.Scanner;

public class level2q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();

        int arr[] = new int[10];
        int index = 0;

        // Store digits
        while (num != 0 && index < 10) {
            arr[index] = num % 10;
            num = num / 10;
            index++;
        }

        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }

}
