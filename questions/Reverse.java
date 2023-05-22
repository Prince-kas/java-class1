
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int reverse=0;int remainder;
        
        while(n>0){
            remainder=n%10;
            reverse=reverse*10+remainder;
            n/=10;

        }
        System.out.println("reverse="+reverse);
    
   }
}
