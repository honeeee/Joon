package BaekJoon;

import java.util.Scanner;

public class Joon1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		String [] arr = st.split("-"); // '-' 기준으로 배열에 담기 
		
		//처음 '-'전 앞숫자에 '+' 가 있으면!! 그거는 + 로 나눠서 arr2에 넣기 
		//없으면 넘어감 
		String [] arr2 = arr[0].split("\\+");
		
		//그리고 그 배열arr2의 값을 변수에 대입!
		int a = 0;
		for(String b : arr2)
			a += Integer.parseInt(b);
		//이렇게 하면 a에는 두값이 누적된상태임 
		
		int sum = 0;
		
		for(int i=1;i<arr.length; i++) {
			
			String [] arr3 = arr[i].split("//+");
			
			//배열의 값을 변수에 대입 
			for(String b : arr3)
				sum += Integer.parseInt(b);
		}
		
		System.out.println(a-sum);

	}

}
