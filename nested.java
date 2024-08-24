class Hello{
    public static void main(String[]args){
        char c='b';
        if(c>='A'&&c<='Z')
        {
            System.out.println("Upper alphabet");
        }
         else if(c>='a'&&c<='z')
        {
            System.out.println("Lower alphabet");
        }
        else if(c>='0'&&c<='9')
        {
            System.out.println("number");
        }
        else
        System.out.println("symbol");
        
        

    }

}