package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ex2 {
	public static void main(String[] args) {
		
		//all random 1-49 num
		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		//shuffle array
		Collections.shuffle(Arrays.asList(arr));
		
		//only 6 num from previous array
		Integer[] arr2 = new Integer[6];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=arr[i];
		}
		
		Scanner scan= new Scanner(System.in);
		ArrayList<Integer> lotto= new ArrayList<>() ;

		
		for (int i = 0; i < 6; i++) {
			System.out.println("Input a number 1-49 --->"+(i+1)+" number");
			
			try{
				int num=Integer.parseInt( scan.nextLine() );
				if(!goodRange(num)) {
					System.out.println("wrong number");
					--i;
					continue;
				}
				if(!lotto.contains(num)) {
					lotto.add(num);
				}
				else {
					System.out.println("repeat number");
					--i;
					continue;
				}
			
			}catch(Exception e ) {
				System.out.println("wrong type");
				--i;
			}					
		}
		int counter=0;
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(lotto.toString());	
		
		for (int num :arr2) {
			if(lotto.contains(num)) {
				counter++;
			}
		}
		if(counter>=3) {
			System.out.println("you won "+counter+" points");
		}
		else {
			System.out.println("you lost "+counter+" points");
		}
	}
	
	static boolean goodRange(int n) {
		if(n>=1 && n<=50) return true;
		return false;
	}
	
}
