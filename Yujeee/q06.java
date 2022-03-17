import java.util.Scanner;

public class q06 {
	
	public static void main(String[] args) {
		int[] food_times = {3, 1, 2};// 먹어야 하는 음식의 시간 
		long k = 3; // 시간 제시
		
		int rv = solution(food_times, k);
		System.out.print(rv);
	}
	
	public static int solution(int[] food_times, long k) {
        int answer = 1;
		long summary = 0;
		for (int i = 0; i < food_times.length; i++) {
            summary += food_times[i];
        }

		if (summary <= k) {
			answer = -1;
			return answer;
		}
		
        
        while(k>0) {
        	
        	for(int i = 0; i<food_times.length; i++) {
        	
        		if(k > 0 && food_times[i]>0 ) { 
        			k--; 
        			food_times[i]--;
        		}
        		        		
        		else if (k == 0) {
        			int l =0;
        			if ( i == food_times.length) 
        				l = 0;
        			else
        				l = i+1;
        			for(int j = l; j<food_times.length; j++ ) {
        				if (food_times[j] > 0) {
        					answer = j;
        					break;
        				}
        				
        			}
        			
        		}
        		
        	}
        	
        }
        
        return answer;
        
    }
    
}

//진행된 시간 = K초를 음식의 가짓수로 나누면 회전한 수 -> 0으로 처리
//(K%M)의 결과 값 = 돌아가는 시간??? 정수부분은 0처리, 
//나머지가 다시 시작한 음식 수 아닌가
//5초 경과 후 3개 음식 -> 5/3 = 몫은 1, 나머지는 2 그러면 ? 2까지 먹었고 
// 아 3초 1초 2초 각각 걸리는거구나....
