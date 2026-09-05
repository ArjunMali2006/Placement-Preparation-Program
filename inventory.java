import java.util.Scanner;
public class inventory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. Of Products:");
        int n = sc.nextInt();
        int prod[]=new int[n];
        System.out.print("Enter no. of stocks:");
        for(int i=0;i<n;i++){
            prod[i]=sc.nextInt();
        }
        int total=prod.length;
        int max_prod=0;
        int min_prod=0;
        for(int i=0;i<n;i++){
            if(prod[i]>prod[max_prod]){
                max_prod=i;
            }
        }
        for(int i=0;i<n;i++){
            if(prod[i]<prod[min_prod]){
                min_prod=i;
            }
        }
        for(int i=0;i<n;i++){
            int avg=prod[i]/2;
            System.out.println("Avg for prod "+i+"is:"+avg);
        }
        int reorder=0;
        for(int i=0;i<n;i++){
            if(prod[i]<20){
                reorder++;
            }
        }
        System.out.println("Total products: "+total);
        System.out.println("product with max stock: "+max_prod);
        System.out.println("Product with min stock: "+min_prod);
        System.out.println("Number of products requiring reordering: "+reorder);
        sc.close();
    }
}
