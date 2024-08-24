import java.lang.Math;
import java.util.*;
public class Armstrong2{
    public static void main(String[]args){
        System.out.println("Enter a num n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,c=0,d=0 ,arm=0;
        int m=n;
        while(n!=0){
            c++;
            d=n%10;
            arm+=(Math.pow(d,c));
           
           n=n/10;
        }
         System.out.println("num="+c);
         System.out.println("arm="+arm);
         if(arm==m)
         System.out.println("armstrong");
         else
         System.out.println("non armstrong");
    }
}
