import java.util.Scanner;
public class payroll {
    public static double calculateBasicSalary(String type, int hoursWorked) {
        double basic = 0;
        if (type.equalsIgnoreCase("Full Time")) {
            basic = 500 * hoursWorked;
        } else if (type.equalsIgnoreCase("Part Time")) {
            basic = 250 * hoursWorked;
        } else {
            basic = 350 * hoursWorked;
        }
        return basic;
    }
    public static double calculateHRA(double basic) {
        return 0.20 * basic;
    }
    public static double calculateDA(double basic) {
        return 0.15 * basic;
    }
    public static double calculatePF(double basic) {
        return 0.12 * basic;
    }
    public static double calculateGrossSalary(double basic, double hra, double da) {
        return basic + hra + da;
    }
    public static double calculateTax(double gross) {
        double tax = 0;
        if (gross < 50000) {
            tax = 0;
        } else if (gross >= 50000 && gross < 100000) {
            tax = 0.10 * gross; // 10% tax rate
        } else {
            tax = 0.20 * gross; // 20% tax rate
        }
        return tax;
    }
    public static double calculateNetSalary(double gross, double tax, double pf) {
        return gross - tax - pf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employment Type (Full Time / Part Time / Other): ");
        String type = sc.nextLine();

        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();

        double basic = calculateBasicSalary(type, hours);
        double hra = calculateHRA(basic);
        double da = calculateDA(basic);
        double pf = calculatePF(basic);
        double gross = calculateGrossSalary(basic, hra, da);
        double tax = calculateTax(gross);
        double netSalary = calculateNetSalary(gross, tax, pf);

        System.out.println("\n--- Salary Slip ---");
        System.out.println("Basic Salary : " + basic);
        System.out.println("HRA          : " + hra);
        System.out.println("DA           : " + da);
        System.out.println("PF Deduction : " + pf);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Net Salary   : " + netSalary);

        sc.close();
    }
}