package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;



public class Q6_316p {

    public int soultion(int [] food_times, long k) {
        LinkedList<Food> list = new LinkedList<>();
        int len = food_times.length;
        for (int i = 0; i < len; i++) {
            list.add(new Food(i + 1, food_times[i]));
        }
        Collections.sort(list, (o1, o2) -> o1.time - o2.time);
        //람다식 이용한 사용자 정의 정렬 -> 이 부분 조금 더 공부하기!

        int currentTime = 0;
        int idx = 0;

        for (Food f : list) {
            long diff = f.time - currentTime;
            if (diff != 0) {
                long spend = diff * len;
                if (spend <= k) {
                    k -= spend;
                    currentTime = f.time;
                } else {
                    k %= len;
                    list.subList(idx, food_times.length).sort(((o1, o2) -> o1.num - o2.num));
                    return list.get(idx + (int) k).num;
                }

            }
            idx++;
            len--;
        }
        return -1;
    }

        public class Food {
            int num, time;

            public Food(int num, int time) {
                this.num = num;
                this.time = time;
            }
        }

}

//참고 : https://moonsbeen.tistory.com/371


