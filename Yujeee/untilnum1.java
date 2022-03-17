import java.util.Scanner;

public class untilnum1 {

	public static void main(String[] args) {
		
		// 하고 싶은 행동 = 최대한 많은 횟수로 나눌 것
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
	while (true) { // 만족될 때까지 반복 , 만족되면 중간에 out
		
			int target = ( n / k ) * k;
			result = result + (n - target);
			n = target;
			
			if (n < k) break; 
			
			result = result + 1;
			n = n / k;
	}
		
		result = result + (n-1);
		System.out.println(result);
		
		
	}

}
