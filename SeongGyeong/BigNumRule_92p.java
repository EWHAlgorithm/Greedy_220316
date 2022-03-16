package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BigNumRule_92p {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); //입력받기 위해 BufferdReader 사용

        int N, M, K;
        N=sc.nextInt(); //배열의 크기
        M=sc.nextInt(); //더하는 횟수
        K=sc.nextInt(); //반복 가능한 최대 횟수

        int[] num = new int[N]; //더할 수 있는 수가 들어있는 배열 선언
        int[] index = new int[N]; //수가 몇 번 사용됐는지 체크할 배열 선언
        int sum=0; //총합

        for(int i=0; i<N; i++) { //더할 수 있는 수들을 입력받고, 인덱스 배열은 동시에 0으로 초기화
            num[i] = sc.nextInt();
            index[i]=0;
        }

        Arrays.sort(num); //num 배열을 점점 커지는 순으로 다시 정렬한다.
        int nIndex=N-1; //현재 인덱스의 위치는 가장 큰 수

        //답지 풀이
        // 6 6 6 5 6 6 6 5 반복되는 원리 이용해서 수식을 세워서 해결
        /*
        int first = num[N-1];
        int second = num[N-2];

        int cnt = (M/(K+1)) * K; //가장 큰 수 6이 반복되는 횟수

        //M이 K+1로 나눠 떨어지지 않을 때
        cnt += (M % (K+1));

        int result =0;
        result = first * cnt;
        result += (M - cnt) * second

        */

        for(int j=0; j<M;j++){
            if(index[nIndex]<K) { //만약 K번만큼 더해지지 않은 상태라면 한 번 더 더한다.
                sum += num[nIndex];
                index[nIndex]++;
            }
            else { //최대수가 K번 더해진 상태라면, 그것보다 작은 수를 한 번 더하고
                index[nIndex]=0; //다시 최대수를 더하도록 인덱스를 0으로 초기화
                sum += num[nIndex-1];
            }
        }

        System.out.println(sum);


    }

}
