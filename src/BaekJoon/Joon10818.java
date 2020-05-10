package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Joon10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr [] = new int [n];
		
		for(int i=0; i<=n-1; i++) {
			
			arr [i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(min>arr[i]) {
				
				min = arr[i];
					
			}
			
			if(max<arr[i]) {
				
				max = arr[i];
			}
		
		}
		
		System.out.println(min + " " + max);
		
		//Arrays.sort(arr);
		//System.out.println(arr[0] + " " + arr[arr.length-1]);
		
		//위에꺼가 더 빠르다
 
	}

}
