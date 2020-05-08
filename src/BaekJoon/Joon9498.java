package BaekJoon;

import java.util.Scanner;

public class Joon9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=90)
			System.out.println("A");
		
		else if(n<=89&&n>=80)
			System.out.println("B");
		
		else if(n>=70&&n<=79)
			System.out.println("C");
		
		else if(n>=60&&n<=69)
			System.out.println("D");
		
		else
			System.out.println("F");
		
	}

}
