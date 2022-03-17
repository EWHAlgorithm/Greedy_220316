// 같은 경우에 다음으로 넘어가서 카운트 하기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q05 {
	
	public static int n;
	public static ArrayList<Integer> arrayList = new ArrayList<>();

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 공의 개수 입력 
		int m = sc.nextInt(); // 무게의 가짓수 입력 
		
		int[] arr = new int[n]; 
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // 공들 입력 
			
		}
		
		Arrays.sort(arr); // 입력한 수 정렬하기 
		
		int cnt = 0;
		for (int i = 0; i < n-1; i++) {
			for ( int j = i+1; j<n; j++) {
				if (arr[i] != arr[j])
					cnt++;
				
			}
			
		}
		sc.close();
		
		System.out.print(cnt);
		
	}
	
}
	


// N개의 공이 있고, M가지의 무게가 존재한다
// 단, 서로 같은 무게의 공은 선택하지 않게 한다
// 같은 숫자와 비교가 될 경우 skip , 다른 숫자와 비교될 경우 count 추가 