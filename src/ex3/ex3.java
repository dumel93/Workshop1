package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int min = 0;
	    int max = 1000;
	    for (int j =0 ; j < 10; j++) {
					
	        int guess = ((max - min) / 2 + min);
	        System.out.println(guess);
	        
	        System.out.println("Did I guessed? ");
	        	String a=scan.nextLine();
	        if (a.equals("yes")){
	            System.out.println("HUUURAAA");
	            break;
	        }
	        else if (a.equals("no")){
	        	
	            System.out.println("Above? ");
	            String above = scan.nextLine();
	            
	            if (above.equals("yes")) {
	                max = guess;
	                continue;
	           
	            		} 
	            
	            else if (a.equals("no")) {
	        	 		System.out.println("Above? ");
		            String below = scan.nextLine();
	                if (below.equals("yes")){
	                    min = guess;
	                    continue;
	                }
	        
	                else if (below.equals("no")) {
	                    System.out.println("Do not cheat.");
	                    continue;
	                }
	            }
	            else
	                System.out.println("Enter either yes/no");

	            		continue;
	            }
	        
	        else
	            System.out.println("Enter either yes/no");
	    }
	}

}
