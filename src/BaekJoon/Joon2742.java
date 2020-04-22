package BaekJoon;

import java.util.Scanner;

public class Joon2742 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(n);
		
		for(int i=1; i<n; i++) {
			
			System.out.println(n-i);
			
		}
		/*
		for (int i = n; i > 0; --i) {
            System.out.println(i);
        }
		 */
	}

}
