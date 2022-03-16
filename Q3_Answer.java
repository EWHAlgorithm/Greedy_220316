package Greedy;

import java.util.Scanner;
//내가 한 방법이랑 접근은 같은데
//나는 뭉탱이를 배열에 넣었고, 책에서는 뭉탱이를 배열에 넣지 않고 그냥 수가 1 -> 0, 0 -> 1로 바뀌는 순간만
//캐치해서 카운트를 해서 메모리적으로 더 절약이 되었다!

public class Q3_Answer {
    public static String str;
    public static int count0 = 0; //전부 0으로 바꾸는 경우
    public static int count1 = 0; //전부 1로 바꾸는 경우

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str=sc.next();

        //첫 번째 원소 처리 (for문 인덱스 처리하기가 어려워서 이렇게 첫 번쨰 원소만 따로 떼는 것 같음)
        if (str.charAt(0) == '1'){ //100001
            count0 += 1;
        }
        else
        {
            count1 += 1;
        }

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1)) {
                if (str.charAt(i + 1) == '1') count0++;
                else count1++;
            }
        }

    }
}


