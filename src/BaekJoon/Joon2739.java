package BaekJoon;

import java.util.Scanner;

public class Joon2739 {

	public static void main(String[] args) {
		//구구단
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("수입력 ");
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
