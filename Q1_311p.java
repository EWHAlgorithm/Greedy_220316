package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_311p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] member = new int[N];

        for(int i=0; i<N; i++){
            member[i]=sc.nextInt();
        }

        //그룹 수를 최대로 하려면, 오름차순으로 정리해서 앞에서부터 조를 짜면 된다
        // 1 2 2 2 3 에서는 1 , 2 2 , 2 3 이라면 2개의 조가 구성이 된다

        //정렬
        Arrays.sort(member);
        int cnt = 0;
        int totalGroup = 0;

        for(int i=0; i< N; i++){
            //일단 모험가를 넣고 지금 탐색하고 있는 모험가의 공포도가 그룹의 명수와 크거나 같으면 최대 그룹 수가 된다
            cnt += 1;
            if(cnt >= member[i]){
                totalGroup += 1;
                cnt = 0;
            }
        }
        System.out.print(totalGroup);

    }
}
