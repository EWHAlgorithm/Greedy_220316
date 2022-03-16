package Greedy;

import java.util.Scanner;

public class MakeOne_99p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int cnt=0;

        while(N!=1){
            if(N%K==0) //K로 나누어 떨어지면 N을 K로 나누고
                N/=K;
            else //아니면 그냥 1을 뺀다
                N-=1;
            cnt++;
        }

        System.out.println(cnt);
    }
}
