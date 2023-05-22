import java.util.*;
public class Sumdigit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m;
        int sum=0;
       
        while(n>0){
            m=n%10;
         
            sum=sum+m;
            n=n/10;

        }
        System.out.println("sum of digit="+sum);
    }
}
