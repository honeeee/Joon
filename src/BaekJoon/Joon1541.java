package BaekJoon;

import java.util.Scanner;

public class Joon1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		String [] arr = st.split("-"); // '-' �������� �迭�� ��� 
		
		//ó�� '-'�� �ռ��ڿ� '+' �� ������!! �װŴ� + �� ������ arr2�� �ֱ� 
		//������ �Ѿ 
		String [] arr2 = arr[0].split("\\+");
		
		//�׸��� �� �迭arr2�� ���� ������ ����!
		int a = 0;
		for(String b : arr2)
			a += Integer.parseInt(b);
		//�̷��� �ϸ� a���� �ΰ��� �����Ȼ����� 
		
		int sum = 0;
		
		for(int i=1;i<arr.length; i++) {
			
			String [] arr3 = arr[i].split("//+");
			
			//�迭�� ���� ������ ���� 
			for(String b : arr3)
				sum += Integer.parseInt(b);
		}
		
		System.out.println(a-sum);

	}

}
