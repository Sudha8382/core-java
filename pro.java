public class pro {
    public static void main(String[] args) {
        String ns="";
        String s="This is pen";
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(Character.isUpperCase(c)){
                ns=ns+Character.toLowerCase(c);
            }
        
        else{
            ns=ns+Character.toUpperCase(c);
        
    }
    
}
System.out.print(ns);
}
}