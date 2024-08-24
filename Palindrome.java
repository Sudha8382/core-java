public class Palindrome {
    public static void main(String[]args){
        int n=121,c,sum=0;
        int m=n;
        //System.out.println("n="+m);
        while(n>0){
            c=n%10;
            sum=sum*10+c;
            //System.out.println("input value:"+n);
            n=n/10;
        }
            System.out.println("n="+m);
            System.out.println("sum="+sum);
            if(sum==m)
                System.out.println("palindrome");

            
            else
            System.out.println("non palindrome");
        
    }
    
}
