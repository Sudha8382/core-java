import java.util.Scanner;
public class Mom{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the no:");
        
        n=s.nextInt();
        //System.out.println("enter the no:");
        switch (n){
            case 10:
            System.out.println(10);
            break;
            case 20:
            System.out.println("20");
            break;
            default:
            System.out.println("invalid");
        }
       
    }
}