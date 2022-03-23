package Greedy_1;

public class MakeBigNum {

    public String solution(String number, int k) {

        StringBuilder sb = new StringBuilder();

        int idx = 0;
        int cmp = 0;

        for(int i = 0; i < number.length()-k; i++){ //뒤에 k-1자리수 제외한 앞 부분 체크
            cmp = 0;
            for(int j = idx; j <= i+k; j++){
                if(cmp < number.charAt(j)-'0') {
                    cmp = number.charAt(j) - '0';
                    idx = j + 1; //앞 자리 수로 고른 그 뒷 수부터 체크
                }
            }
            sb.append(cmp);
        }

        /*
        15453276767 에서 가장 큰 4자리의 수를 만드려면(k=3)
        뒤에 3자리를 제외하고 15453276에서 가장 큰 수를 찾는다 => comp = 7
        6767에서 뒤에 2자리를 제외하고 큰 수를 찾는다 => 7
        67에서 뒤에 한 자리를 제외하고 큰 수를 찾는다 => 6
        7767

        1924 에서 가장 큰 자리의 2자리 수를 만드려면
        뒤에  한 자리를 제외하고 큰 수 => 9
        그리고 뒤에 24 중에서 더 큰 수 => 4
         */

        return sb.toString();
    }
}
