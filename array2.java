import java.util.*;
public class array2 {
    public static void main(String[]arsg){
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the 5 num:");
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Entered array:");
        for(int i=0;i<5;i++){
         System.out.print(+a[i]+" ");
        }

    }

    
}
