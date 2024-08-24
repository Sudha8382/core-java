import java.lang.Math;
public class Arm3{
    public static void main(String[]args){
        int c=0,n=153,rem=0,arm=0;
        int m=n;
        while(n>0){
            c++;
            n=n/10;
        }
        System.out.println("c="+c);
        n=m;
        while(n>0){
            rem=n%10;
            arm+=(int)(Math.pow(rem,c));
            n=n/10;
        }
        if(arm==m){
            System.out.println("armstrong");
        }
        else
        System.out.println("non armstrong");
        }

    }
