public class PARSING {
    public static void main(String[] args) {
        String s="123";
        Integer i=Integer.parseInt(s);
        Float j=Float.parseFloat(s);
        System.out.println(i);
        System.out.println(j);
        Integer a=10;
        String d=a.toString();
        System.out.println(d);
        System.out.println(d+9);
        System.out.println(d.length());
        int e=10;
        String f=String.valueOf(e);
        System.out.println(f);
        Character c='a';
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isWhitespace(c));
        System.out.println(Character.isUpperCase(c));
        System.out.println(Character.isLowerCase(c));
        System.out.println(Character.toUpperCase(c));
        System.out.println(Character.toLowerCase(c));
        System.out.println(Character.toString(c));
    }
    
}
