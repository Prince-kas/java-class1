import java.util.*;
public class SumA {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int size=sc.nextInt();
        int number []= new int[size];
        
        for (int i=0; i<size; i++){
           number[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            sum=sum+number[i];
        }
        System.out.println(sum);

    }
    
}
