package Greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q3_313p {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        //사고 과정
        //1. 자른 뭉탱이들을 배열에 넣는다
        //2. 1 뭉탱이가 많은지, 0 뭉탱이가 많은지 개수를 센다
        //3. 더 적은 뭉탱이를 뒤집는다

        //number.substring()

        int from=0, end=0;
        ArrayList<String> al = new ArrayList<>();

        //1
        for(int i=1; i<number.length(); i++){
            char prev = number.charAt(i);
            char back = number.charAt(i-1);
            if(prev != back){
                end = i;
                String num =number.substring(from, end);
                al.add(num);
                from = i;
            }
        }
        al.add(number.substring(from));

        //2
        int zeroCnt=0, oneCnt=0;
        for(int j=0; j<al.size(); j++){
            if(al.get(j).charAt(0) == '0')
                zeroCnt++;
            else
                oneCnt++;
        }

        System.out.print(zeroCnt < oneCnt ? zeroCnt:oneCnt);


    }
}
