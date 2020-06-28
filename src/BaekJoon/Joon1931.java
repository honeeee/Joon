package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Joon1931 {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		// ȸ���� ���۽ð� ����ð� �Է¹޾Ƽ� �迭�� �ֱ�
		for(int i=0; i<arr.length; i++) {
			//StringTokenizer : ���ڿ��� �������� �������� 
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			
			//0 : o1==o2
			//1 : o1>o2
			//-1 : o1<o2
			//�̷��� ��ȯ�ϵ��� �ϸ� ��
			
			//arr[n][1](������ �ð�) �������� �������� �����ϰ� 
			@Override
			public int compare(int[] start, int[] end) {
				
				//���� ������ �ð��� ���� ��찡 ������ �װ͵��� ���۽ð� �������� ����
				if(end[1]==start[1]){
					return start[0]-end[0];
				}else
					return start[1]-end[1];
			}
		});
		
		//������ �ð��� ��� �������� 
		int end = -1;//����ȸ���� �����̶� ���Ұ�  
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			//�������۽ð��� ���� ���Ẹ�� ������ if�� �н� 
			//���� ���۽ð��� ���� ȸ������ ����ð�(end)���� ũ��!(==������) 
			if(arr[i][0] >= end) { 
				end = arr[i][1];//�� ȸ��(����ȸ��)�� ���� -> end�� ������ ȸ������ð��̵� ����ȸ�Ƕ� ���ؾ��ϴϱ� ���� 
				count++;
			}
		}
		//�׸��� �ִ��� ������ ȸ���� �� ��� 
		System.out.println(count);
	}
}
