import java.util.*;
public class Ecount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1="Umbrella";
        int l=s1.length();
        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);


            if(ch=='e'){
               
                System.out.println("Found e at"+i); 
                break;

            }
           
        }
            //System.out.println("nf"); 
           
        

    }
    
}
