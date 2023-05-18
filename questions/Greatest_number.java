import java.util.*;
public class Gratest_number {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter three numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    if(a>b & b>c){
        System.out.println("a is greatest number");

    }
    else if(b>a & a>c){
        System.out.println("b is greatest number");
    }
        
    else {
        System.out.println("c is greatest number");


    }
} 
    
}

