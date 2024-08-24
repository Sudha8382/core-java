import java.lang.Math;
public class Binary {
    public static void main (String[]args){
    int n=10,rem,bin=0,i=0;
    while(n>0){
        rem=n%2;
        bin+=((int)Math.pow(10,i))*rem;
        n=n/2;
        i++;

    }
    System.out.println("binary="+bin);

    // int n=1000,rem=0,dec=0,i=0;
    // while(n>0){
        
    //     rem=n%10;
    //     System.out.println("i="+rem);
    //     dec+=rem*(int)Math.pow(2,i);
    //     n=n/10;
    //     i++;
    //     //System.out.println("Decimal="+dec);
    // }
    // System.out.println("Decimal="+dec);
    }

    
    
}
