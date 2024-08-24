public class streverse {
    public static void main(String[]args){
        String s="rabar";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
         System.out.println("Original String: " + s);  
        System.out.println("Reversed String: " + rev);
        if(s.equals(rev))  {
            System.out.println("palindrome");
        }
        else{
            System.out.println("non palindrome");
        }

    }
    
}
