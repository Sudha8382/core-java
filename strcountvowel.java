public class strcountvowel {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String s = "SCHOOL";    
            
        //Converting entire string to lower case to reduce the comparisons    
       s = s.toLowerCase();    
            
        for(int i = 0; i<s.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }
    }
    

