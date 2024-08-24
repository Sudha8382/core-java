class Vowelowel{
    public static void main(String[]args){
    /*int n=7;
    if((n>='A'&&n<='Z')||(n>='a'&&n<='z')){
        if((n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='i'||n=='O'||n=='U'))
        {
            System.out.println("Vowel");
        }
        else
        System.out.println("consonent");
    }
    else
    System.out.println("non alphabet");
    */
    int n=2001;
    if(n%400==0&&n%4==0)
    {
        System.out.println("leap year");
    }
    else if(n%100!=0)
    {
        System.out.println("not leap year");
    }
    

}
    
    
}
