import java.util.Scanner;

public class Main {

    static double taxRate = 0.15;
    static double overageFee = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        double baseCost = getBaseCost();
        int overageMinutes = getOverageMinutes();

        scanner.close();

    }

    public static double getBaseCost() {
        double baseCost;
        do {
            System.out.println("Enter base cost of the plan:");
            baseCost = scanner.nextDouble();
        } while (baseCost < 0);
        return baseCost;
    }

    public static int getOverageMinutes() {
        int overageMinutes;
        do {
            System.out.println("Enter overage minutes:");
            overageMinutes = scanner.nextInt();
        } while(overageMinutes < 0);
        return overageMinutes;
    }

}
