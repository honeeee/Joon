package BaekJoon;

import java.util.Scanner;

public class Joon2739 {

	public static void main(String[] args) {
		//������
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("���Է� ");
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
