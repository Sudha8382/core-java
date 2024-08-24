public class string { 
    public static void main(String[] args) {
        String  s="  hello ";  
        System.out.println(s.trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println((s.charAt(5)));
        System.out.println(s.indexOf('l'));
        System.out.println(s.lastIndexOf('o'));
        System.out.println(s.concat("hi"));
        System.out.println(s.equals("hello"));
        System.out.println(s.equalsIgnoreCase("  hello "));
        System.out.println(s.replace('h','k'));
        System.out.println(s.substring(2));
        System.out.println(s.substring(1,3));
        System.out.println(s.startsWith("he"));
        System.out.println(s.endsWith("lo"));
        System.out.println(s.compareTo("Hello")==0);
        System.out.println(s.compareToIgnoreCase("hello"));
        String s2=String.valueOf(123);
        System.out.println(s2);
        
        
    }
    
}
