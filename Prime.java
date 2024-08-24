import java.util.*;
public class Prime{
    public static void main(String[]args){
        System.out.println("Enter an num:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%2==0){
                System.out.println("Not prime");
                flag=1;
                break;

            }
        }
            if(flag==0)
            System.out.println(n+"Prime num");
        

    }
}