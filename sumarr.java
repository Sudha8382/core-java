import java.util.*;
public class sumarr {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num of element:");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("enter "+n+" element");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        System.out.println("entered array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Sum of arr:");
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+i;
            //System.out.println("sum"+sum);
        }
        System.out.println("sum:"+sum);
    }

    
}
