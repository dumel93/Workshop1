package ex1;

import java.util.Random;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args)  {
		guessNum();
	}

	private static void guessNum() {
		Random gen= new Random();
		int a=gen.nextInt(101);
		while(true) {
			System.out.println("Guess a number: ");
			try{	
				Scanner scan = new Scanner(System.in);
			
				int g =scan.nextInt();
				if (g==a) {
					System.out.println("You have just guessed");
					break;
				}else if(g>a) {
					System.out.println("Above! ");
					
				}else if(g<a) {
					System.out.println("Below! ");
					
				}
			}catch(Exception e) {
				System.out.println("Wrong type");;
				continue;
			}
			
		}
	}
}

