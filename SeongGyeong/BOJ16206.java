package Greedy_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ16206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long totalPrice = 0;

        //도시 개수 입력받기
        int N = Integer.parseInt(br.readLine());
        ArrayList<Long> distance = new ArrayList<>();
        ArrayList<Long> price = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //도시간 거리 입력받기
        for(int i=0; i<N-1; i++)
            distance.add(Long.parseLong(st.nextToken()));

        //도시별 리터당 가격 입력받기

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++)
            price.add(Long.parseLong(st.nextToken()));

        //일단 첫 번째에는 갈 기름이 없으니까 두 번째 지역까지 갈 기름만 넣고 시작한다.
        /*long k = price.get(0) * distance.get(0);
        totalPrice += k;

        long now_price = price.get(0);
        long sum_distance = 0;*/

       /* for(int j=1; j<N-1; j++){
            if(now_price <= price.get(j)) {
                sum_distance += distance.get(j);
            }
            else {
                k = now_price * sum_distance;
                totalPrice += k;
                now_price = price.get(j);
                sum_distance = distance.get(j);
            }
        }

        k = now_price * sum_distance;
        totalPrice += k;*/

       long min = Integer.MAX_VALUE;

       for(int i=0; i<N-1; i++){
           min = Math.min(price.get(i),min);
           totalPrice += distance.get(i)*min;
       }


        System.out.println(totalPrice);
    }
}

