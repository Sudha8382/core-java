import java.util.Scanner;
public class Game2 {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int score=0,n,c=0;
	System.out.print("Who invent the computer?\n");
	System.out.println(" 1.Charles Babbage\n 2.Darvin\n 3.John \n4.charls card");
	System.out.println("enter any option");
	n=s.nextInt();
	if(n==1) {
		System.out.print("Your ans is true.\n");
		score+=10;
		c++;
       
    }
        else {
            System.out.println("your ans is wrong.\n");
        }

		// System.out.println("who invent computer");
		// System.out.println(" 1.charls babbage\n 2.akash\n 3.akhand 4.ravi");
		// System.out.println("enter any number");
        System.out.println("Who wright the constitution of India?");
        System.out.println("1.Gandhi ji\n2.Dr Bhimrao ambedkar\n3.pt nehru\n4.Bose");
        System.out.println("enter any option");
		n=s.nextInt();
		if(n==2) {
				System.out.println("Your ans is wright.");
				score+=10;
				c++;
              
        }
        else{
            System.out.println("Your ans is wrong");
        }
        n=s.nextInt();
        System.out.println("Who developed java programming?");	
        System.out.println("1.guido van russoim\n2.ramaratan\n3.sum microsystem\n4.all of the above");
        System.out.println("enter any option");
        if(n==3){
            System.out.println("Your ans is true.");
            score+=10;
            c++;
        }
        else{
            System.out.println("Your anss is wrong.");
        }
        System.out.println("your score is "+score);
        System.out.println("you played "+c+ " questions");
	}
	
	}