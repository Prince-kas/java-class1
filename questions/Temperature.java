import java.util.*;
public class Temperature {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temp in centigrade");
        Float tempC=sc.nextFloat();
        Float tempF=0.0f;
       
        tempF=(tempC*9/5)+32;
        System.out.println("tempF="+tempF);

    }

    
}
