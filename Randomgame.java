import java.lang.Math;
import java.util.*;
public class Randomgame {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int rn=(int)(Math.random()*100);
        int gn,c=0;
         System.out.println("Guess your num or enter zero if you don't want to play");
        while(true){
            c++;
            //System.out.println("Guess your num or enter zero if you don't want to play");
            gn=s.nextInt();
            if(gn==rn){
                System.out.println("you gussed in"+c+"times");
                break;
            }
                else if(gn==0){
                    System.out.println("Thank you for playing.");
                    break;

            }     
            if(gn>rn)
            System.out.println("enter smaller num");
            else
            System.out.println("enter larger num");
           }

    }
    
}
