package BaekJoon;

import java.util.Scanner;

public class Joon2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int [9];
		
		int n = 0;
		int max = 0;
		
		for(int i=0; i<9; i++) {
			
			arr[i] = sc.nextInt();
			
			if(arr[i]>max) {
				
				max = arr[i];
				n = i+1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(n);

	}

}


//public static void main(String[] args) {
//	
//	Scanner sc = new Scanner(System.in);
//	
//	int arr [] = new int [9];
//	
//	for(int i=0; i<arr.length; i++) {
//		
//		arr[i] = sc.nextInt();
//		
//	}
//	
//	int n = 0;
//	int max = 0;
//	
//	for(int i=0; i<arr.length; i++) {
//		//���� max�� 0���� �ٲ������ϱ� ���� �����̸�ó���ε���0���̾��
//		if(arr[i]>max) {
//			
//			max = arr[i];
//			n = i+1;
//		}
//		
//	}
//	
//	System.out.println(max);
//	System.out.println(n);
//
//}
