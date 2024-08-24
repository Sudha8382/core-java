// import java.lang.Math;
// import java.util.Scanner;
// public class LCM{
//     public static void main(String[]args){
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter a:");
//         int a=s.nextInt();
//         System.out.println("Enter b:");
//         int b=s.nextInt();
//         int i;
//         int n=(a>b)?a:b;
//         for( i=n;i<=a*b;i=i+n)
//         {
//             if(i%a==0&&i%b==0)
//             break;
        
//         }
//         System.out.println("LCM of "+a+" and "+b+" is: "+i);
        

//     }
// }



//2nd method
import java.lang.Math;
class LCM{
    public static void main(String[]args){
int a = 12, b = 9, gcd = 1;   
for(int i = 1; i <= a && i <= b; ++i)   
{  

if(a % i == 0 && b % i == 0)  
gcd = i;  
}   
int lcm = (a * b) / gcd;  
System.out.print( lcm);  
}  
}  

//3rd method
// import java.lang.Math;

// class LCM{
//     public static void main(String[]args){
//         int a=10,b=20,lcm=1,c;
//         c=Math.max(a,b);
//         for(int i=c;i<=a*b;i++){
//             if(i%a==0&&i%b==0)
//             lcm=i;
//             break;
//         }
//         System.out.println(lcm);

//     }


// }    




    
