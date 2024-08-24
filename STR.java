public class STR {
    public static void main(String[] args) {
        String str="This is the pen.";
        String nstr=" ";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='A'&&c<='Z'){
                c=(char)(c+32);

                      }
                      else{
                        c=(char)(c-32);
                      }
                      nstr=nstr+c;
        }
        System.out.println(nstr);
    }
    
}
