import java.util.*;
public class SumEO {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
int n=sc.nextInt();
int sum1=0;
int sum2=0;
for(int i=0; i<=n; i++){
    if(i%2==0)
    {
        sum1=sum1+i;
    }
    else{
        sum2=sum2+i;
    }

}     
    System.out.println("Sum of even="+sum1);
    System.out.println("Sum of odd="+sum2);
}
}
