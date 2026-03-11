import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        double[] x = new double[4];
        double[] y = new double[4];

        System.out.print("Enter x vector numbers (max 4):");
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextDouble();
        }

        System.out.print("Enter y vector numbers (max 4):");
        for (int i = 0; i < 4; i++) {
            y[i] = sc.nextDouble();
        }
        System.out.println("Hello " + name + "!" + " Here are the vectors you entered:");
        System.out.print("Your x: ");
        for (double num : x) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Your y: ");
        System.out.println();
        for (double num : y) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Distance: " + StatisticsHelper.calculateDistance(x, y));
        sc.close();
    }
}
