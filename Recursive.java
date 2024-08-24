public class Recursive {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else
        return sum(n-1)+n;
    }
    public static void main(String[]args){
        int x=sum(5);
        System.out.println(x);
    }
    
}
