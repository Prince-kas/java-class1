import java.util.*;
public class sumoftwo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int size=sc.nextInt();
        int sum[]=new int[size];
        int arr1[]= new int[size];
        int arr2[]= new int [size];
       
        for(int i=0; i<size; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
           arr2[i]=sc.nextInt();
        
        }
        for(int i=0; i<size; i++){
            sum[i]=arr1[i]+arr2[i];

        }
        System.out.println("SUM OF TWO ARRAY");

        for(int j=0; j<size; j++){
            System.out.println("sum[]:"+sum[j]);

        }
    }
    
}
