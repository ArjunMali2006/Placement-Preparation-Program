import java.util.Scanner;
public class book {
    static void calculate(int bookid, int duedate, int returndate) {
        if (returndate > duedate) {
            int fine = 5 * (returndate - duedate);
            System.out.println("Fine is: " + fine);
        }
        else if (returndate == duedate) {
            System.out.println("On Time \nThank You!");
        }
        else {
            System.out.println("Early");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("Enter Book ID: ");
            int bookid = sc.nextInt();

            System.out.print("Enter Due Date: ");
            int duedate = sc.nextInt();

            System.out.print("Enter Return Date: ");
            int returndate = sc.nextInt();

            calculate(bookid, duedate, returndate);

            System.out.print("Do you want to return another book? (1-Yes / 0-No): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }
        }
        sc.close();
    }
}