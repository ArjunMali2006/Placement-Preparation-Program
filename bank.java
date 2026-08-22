import java.util.Scanner;

public class bank {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int years = sc.nextInt();

        double originalPrincipal = principal;

        for (int i = 1; i <= years; i++) {

            double interest = principal * rate / 100;
            principal = principal + interest;

            System.out.println("Year = " + i
                    + " Interest = " + interest
                    + " Total Amount = " + principal);
        }

        double totalInterest = principal - originalPrincipal;

        System.out.println("Total Amount = " + principal);
        System.out.println("Total Interest = " + totalInterest);

        sc.close();
    }
}