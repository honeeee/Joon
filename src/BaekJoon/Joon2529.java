package BaekJoon;

import java.util.Scanner;

//import com.sun.tools.javac.main.CommandLine.Tokenizer;

public class Joon2529 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//기호 갯수(k) 받고 
		int k = sc.nextInt();
		
		//부등호 배열 
		String [] giho = new String[k];
		
		//배열에 부등호 넣기 	
		giho = sc.next().split(" ");
		
		//그 갯수만큼 어떤 기호인지 받고
		for(int i=0; i<=k; i++) {
			
			//<,> 가 맞는지 검사?
			if(giho[i]=="<"||giho[i]==">") {
			
		}
			
			
			
		}
		
		// k+1개 갯수의 숫자들을 기호 배열 사이사이에 넣어야
		//같은 숫자가 있으면 안됨
		//0-9까지가능함 
		//부등호를 성립하면서 중복안된숫자여야함 
				
		//최댓값 최솟값 두개 출력해야함 

	}

}
