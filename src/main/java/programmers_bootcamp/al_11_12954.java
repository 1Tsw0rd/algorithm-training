package programmers_bootcamp;

import java.util.Arrays;

public class al_11_12954 {
    public static void main(String[] args) { //https://school.programmers.co.kr/learn/courses/30/lessons/12954
        //x는 첫 숫자이자 증가치
        //n은 개수
        int x = -4;
        int n = 2;
        Long[] answer = new Long[n];
        Long z = Long.valueOf(x);

        for(int i = 0; i < n; i++){
            answer[i] = z;
            z += x;
        }
        System.out.println(Arrays.toString(answer));


    }
}
