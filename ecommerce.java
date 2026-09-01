import java.util.Scanner;

public class ecommerce {

    public static double calculateShipping(double weight) {
        return 50 + 10 * weight;
    }

    public static double calculateShipping(double weight, int dist) {
        return 50 + 10 * weight + 2 * dist;
    }

    public static double calculateShipping(double weight, int dist, boolean isExpress) {
        double charges = 50 + 10 * weight + 2 * dist;
        if (isExpress) {
            charges += 100;
        }
        return charges;
    }

    public static double calculateCartTotal(double prices[]) {
        double carttotal = 0;
        for (int i = 0; i < prices.length; i++) {
            carttotal += prices[i];
        }
        return carttotal;
    }

    public static double applyCoupon(double carttotal, String coupon) {
        double couponDiscount = 0;
        if (coupon.equalsIgnoreCase("Save 50")) {
            couponDiscount = 50;
        }
        return couponDiscount;
    }

    public static void generateInvoice(double carttotal, double shipping, double couponDiscount) {
        double totalprice = carttotal + shipping - couponDiscount;
        
        System.out.println("\n----------------------------------");
        System.out.println("          INVOICE DETAILS         ");
        System.out.println("----------------------------------");
        System.out.println("Cart Subtotal:     $" + carttotal);
        System.out.println("Shipping Charges:  $" + shipping);
        System.out.println("Coupon Discount:  -$" + couponDiscount);
        System.out.println("----------------------------------");
        System.out.println("Final Total Price: $" + totalprice);
        System.out.println("----------------------------------");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input instructions & prompts
        System.out.print("Enter number of items in cart: ");
        int n = sc.nextInt();

        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        System.out.print("Enter package weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter shipping distance (km): ");
        int distance = sc.nextInt();

        System.out.print("Is express shipping required? (true/false): ");
        boolean express = sc.nextBoolean();

        sc.nextLine(); // Clear scanner newline buffer
        System.out.print("Enter coupon code (or press Enter to skip): ");
        String coupon = sc.nextLine();

        // Calculations
        double charges = calculateShipping(weight, distance, express);
        double totalCart = calculateCartTotal(prices);
        double discount = applyCoupon(totalCart, coupon);

        // Output breakdown
        generateInvoice(totalCart, charges, discount);

        sc.close();
        
    }
}