import java.util.*;
public class marks {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        Float M,S,E,H,C,sum=0.0f,per=0.0f;
        System.out.println("Enter five subjects number");
        M=sc.nextFloat();
        S=sc.nextFloat();

        E=sc.nextFloat();
        H=sc.nextFloat();
        C=sc.nextFloat();
        
        sum=M+S+H+E+C;
        per=(sum/500)*100;
        System.out.println("sum="+sum);
        System.out.println("per="+per);

    }
}
