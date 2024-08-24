import java.util.*;
public class Funct3 {
    static void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        System.out.println("enter two num:");
        int x,y;
        x=s.nextInt();
        y=s.nextInt();
        mul(x,y);
    }
    
}
