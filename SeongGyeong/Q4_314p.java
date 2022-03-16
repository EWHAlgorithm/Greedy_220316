package Greedy;

import java.util.Arrays;
import java.util.Scanner;


/* 이 문제의 원리

1. target 금액은 1부터 시작한다
2. 화폐 단위를 순차적으로 검색한다
ex. 1 1 2 3 인 경우라면, 1 2 4 7 의 순서로 target을 증가시키며 검사한다
3. target보다 새로 들어오는 수가 크다면 당연히 target을 만들어낼 수 없기 때문에 target이 답이 된다.
 */

public class Q4_314p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //동전 개수 입력 받기
        int N = sc.nextInt();
        int[] coin = new int[N];

        for(int i=0; i<N; i++)
            coin[i] = sc.nextInt();

        Arrays.sort(coin);
        int target = 1;

        for(int i=0; i<N; i++){
            if(target < coin[i]) break;
            target += coin[i];
        }

        System.out.print(target);

    }
}

/*
문제에서 준 예시를 보면
1 1 2 3 9

1 2 4 7 16 의 순으로 target을 증가시키는데
1 -> 다음 target 2
2 -> 다음 target 4
3 4 -> 다음 target 8
근데 다음에 들어오는 수가 16이라 만들 수 없다
그래서 16이 답이 된다

 */