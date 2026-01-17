import java.util.Scanner;

public class Main {

    static double taxRate = 0.15;
    static double overageFee = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        double baseCost = getBaseCost();
        int overageMinutes = getOverageMinutes();
        scanner.close();
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        double overage = calculateOverage(overageMinutes);
        System.out.println("Overage: $" + String.format("%.2f", overage));
        double tax = calculateTax(baseCost, overage);
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f",(baseCost + overage + tax)));
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

    public static double calculateOverage(int overageMinutes) {
        return overageMinutes * overageFee;
    }

    public static double calculateTax(double baseCost, double overage) {
        return (baseCost + overage) * taxRate;
    }

}
