import java.util.Scanner;
public class palindrome {
    public void normal(String abc){
        String result="";
        for(int i=0;i<abc.length();i++){
            result=(abc.charAt(i)) + result;
        }
        if(result.equals(abc)){
            System.out.println("Normal: String is Palindrome" );
        }
        else{
            System.out.println("Normal: String is not palindrome");
        }
    }
    public boolean twopointer(String abc){
        int left=0;
        int right=abc.length()-1;
        while(left<right){
            if(abc.charAt(left) != abc.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        palindrome p = new palindrome();
        String abc=sc.nextLine();
        p.normal(abc);
        p.twopointer(abc);
        if(p.twopointer(abc)){
            System.out.println("Two Pointer: Palindrome");
        }
        else{
            System.out.println("Two Pointer: Not Palindrome");
        }
        sc.close();
    }
}

