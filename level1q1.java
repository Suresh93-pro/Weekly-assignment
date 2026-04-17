import java.util.Scanner;

public class level1q1 {
    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p, r, t;

        System.out.print("Enter Principal: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        r = sc.nextDouble();

        System.out.print("Enter Time: ");
        t = sc.nextDouble();

        double si = calculateSI(p, r, t);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + p + ", Rate " + r + " and Time " + t);
    }

    
}
