package Greedy;

import java.io.*;

public class BOJ5585 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());
        int change = 1000 - price;
        int result=0;

        //500엔, 100엔, 50엔, 10엔, 5엔, 1엔

        int[] coin = {500,100,50,10,5,1};

        for(int i=0; i<coin.length; i++){
            int k = change / coin[i];
            if(k>0) {
                result+=k;
                change -= k*coin[i];
            }
        }
        System.out.print(result);
    }
}
