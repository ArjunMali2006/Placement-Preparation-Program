import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int[] ids = new int[n];
        System.out.println("Enter " + n + " voter IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }
        
        boolean[] visited = new boolean[n];
        boolean foundDuplicate = false;

        System.out.println("\nDuplicate Voter IDs and their total counts:");
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            
            int count = 1; 
            for (int j = i + 1; j < n; j++) {
                if (ids[i] == ids[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            
            if (count > 1) {
                System.out.println("Voter ID " + ids[i] + " appears " + count + " times.");
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate voter IDs found.");
        }

        sc.close();
    }
}