import java.util.Scanner;
public class Game {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int score=0,n,c=0;
	System.out.print("who write fundamental rights");
	System.out.println(" 1.ambedkar\n 2.akash\n 3.akhand \n4.ravi");
	System.out.println("enter any number");
	n=s.nextInt();
	if(n==1) {
		System.out.print("aapko milta hai 1 crore");
		score+=10;
		c++;
		System.out.println("who invent computer");
		System.out.println(" 1.charls babbage\n 2.akash\n 3.akhand 4.ravi");
		System.out.println("enter any number");
		n=s.nextInt();
		if(n==1) {
				System.out.println("aapko milta hai 10 crore");
				score+=10;
				c++;
				System.out.println("who invent computer");
				System.out.println(" 1.charls babbage\n 2.akash\n 3.akhand 4.ravi");
				System.out.println("enter any number");
				n=s.nextInt();
				if(n==1) {
					System.out.print("aapko milta hai 10 crore");
					score+=10;
					c++;
				}	
		}
        
		}

		System.out.println("your score is "+score);
        System.out.println("you played "+c+ " questions");
	}
	
	}