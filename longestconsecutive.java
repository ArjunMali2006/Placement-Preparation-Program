import java.util.Arrays;
public class longestconsecutive {
    public static void main(String[] args) {
        int[] arr={45,1,3,2,54};
       Arrays.sort(arr);
       int longest=1;
       int longeststreak=1;
       for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]) continue;
        if(arr[i]==arr[i-1]+1){
             longeststreak++;
        }
        else{
            longest=Math.max(longest,longeststreak);
            longeststreak=1;
        }
       }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
       System.out.println("Longest="+Math.max(longest,longeststreak));
    }
}
