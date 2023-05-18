import java.util.*;
public class Circle {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        double area=0.0D,circumference=0.0D;
        System.out.println("Enter the value of r");
        Float r=sc.nextFloat();
    
        area=3.14*r*r;
        circumference=(2*3.14*r);
        System.out.println("area="+area);
        System.out.println("circumference="+circumference);


    }
    
}
