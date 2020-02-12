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
		
		// 회의의 시작시간 종료시간 입력받아서 배열에 넣기
		for(int i=0; i<arr.length; i++) {
			//StringTokenizer : 문자열을 공백으로 구분해줌 
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			
			//0 : o1==o2
			//1 : o1>o2
			//-1 : o1<o2
			//이렇게 반환하도록 하면 됨
			
			//arr[n][1](끝나는 시간) 기준으로 오름차순 정렬하고 
			@Override
			public int compare(int[] start, int[] end) {
				
				//만약 끝나는 시간이 같은 경우가 있으면 그것들은 시작시간 기준으로 정렬
				if(end[1]==start[1]){
					return start[0]-end[0];
				}else
					return start[1]-end[1];
			}
		});
		
		//끝나는 시간을 계속 수정해줌 
		int end = -1;//다음회의의 시작이랑 비교할거  
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			//다음시작시간이 지금 종료보다 빠르면 if문 패스 
			//다음 시작시간이 지금 회의중인 종료시간(end)보다 크면!(==느리면) 
			if(arr[i][0] >= end) { 
				end = arr[i][1];//그 회의(다음회의)를 선택 -> end가 선택한 회의종료시간이됨 다음회의랑 비교해야하니까 넣음 
				count++;
			}
		}
		//그리고 최대사용 가능한 회의의 수 출력 
		System.out.println(count);
	}
}
