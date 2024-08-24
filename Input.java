import java.util.Scanner;
public class Input {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
       // System.out.println("enter two number:");
        System.out.println("enter two number:");
        int a=s.nextInt();
        int b=s.nextInt();
        {
            System.out.println("enter from given symbol(+,-,*,/)");
        }
        char c=s.next().charAt(0);
       // char A=s.next().charAt(0);
        if(c=='+')
        System.out.println(a+b);
        else if(c=='-')
        System.out.println(a-b);
        else if(c=='*')
        System.out.println(a*b);
        else if(c=='/')
        System.out.println(a/b);
        else
        System.out.println("envalid input");
        
        
    }

    
}
