package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCardGame_96p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r,c; //층 수, 호 수
        r=sc.nextInt();
        c=sc.nextInt();

        int[][] num =new int[r][c];
        int[] minNum = new int[r]; //각 층의 최솟값 중 가장 큰 값이 결과니까 배열을 만들어 값을 넣어준다.

        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) //한 층씩 입력을 받는다
                num[i][j]=sc.nextInt();
        }

        for(int i=0; i<r; i++){
            Arrays.sort(num[i]); //한 층씩 오름차순대로 정렬을 하고
            minNum[i]=num[i][0]; //한 층의 가장 첫 번째 값, 즉 최솟값을 배열에 넣는다
        }

        Arrays.sort(minNum); //각 층의 최솟값들 중 최댓값을 얻기 위해 정렬
        System.out.println(minNum[r-1]);

        //접근 방법은 같은데 더 좋은 교재 코드

        /*
        //현재 줄에서 가장 작은 수 찾기
       for(int i=0; i<r; i++){
           int min_value = 10001;
           for (int j = 0; j < c; j++){
               int x = sc.nextInt();
               min_value = Math.min(min_value,x);
           }
           //최솟값들 중에 가장 큰 값 찾기
           result = Math.max(result,min_value);
       }
*/
    }

}
