import java.util.*;
public class prime {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     if(n%2==1 && n%1==0){
        System.out.println("prime="+n);
     }
     else{
        System.out.println("not a prime num");
     }
    }
}
