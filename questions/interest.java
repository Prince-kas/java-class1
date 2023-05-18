import java.util.*;
public class interest {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int PA,R,T;
    double SI=0.0D,Ci=0.0D;
    System.out.println("Enter the value of PA,R,T");
    PA=sc.nextInt();
    R=sc.nextInt();
    T=sc.nextInt();
    SI=(PA*R*T)/100;
    System.out.println("SI="+SI);
    
}
}
