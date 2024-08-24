import java.util.*;
public class Funct4 {
    static void trib(int n){
        int a=0;int b=0;int c=1,d;
        System.out.println(a+" "+b+" "+c+" ");
        for(int i=1;i<=n-3;i++){
        d=a+b+c;
        System.out.print(d+" ");
        a=b;
        b=c;
        c=d;
    }

    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter an num:");
        int n=s.nextInt();
        //System.out.println("enter an num:");
        trib(n);
    }
}
    

