package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2_312p {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num =br.readLine();

        //int[] numbers = new int[num.length()];

        /*for(int i=0; i<numbers.length; i++){
            numbers[i]=num.charAt(i)-'0'; //각 자릿수 얻어내기
        }*/

        //이렇게 짜니까 156 으로 들어오는 경우 30보다 31이 더 큰데 그걸 반영 못함
        /*
        Arrays.sort(numbers); //0이 있다면 0을 제외한 가장 작은 수랑 더해야하기 때문에 이것도 정렬해줌

        int result=numbers[0];



        for(int i=1; i< numbers.length; i++){
            if(numbers[i-1] == 0){
                result += numbers[i];
            }
            else
                result *= numbers[i];
        }*/

        long result = num.charAt(0) -'0'; //가장 맨 처음 숫자를 대입

        for (int i=0; i<num.length(); i++){
            //둘 중에서 하나라도 0이나 1이면 더하기
            int number = num.charAt(0)-'0';
            if(number<=1 || result<=1){
                result += number;
            }
            else
                result *= number;
        }

        System.out.println(result);

    }
}
