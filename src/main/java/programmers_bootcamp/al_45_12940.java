package programmers_bootcamp;

import java.util.Arrays;

public class al_45_12940 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12940
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int[] answer = new int[2]; //최대공약수, 최대공배수

        //큰수 mod 작은수 = 값이 0이 될 때까지 => 값이 0이 되면 작은수가 최대공약수
        //(큰수 / 최대공약수) * 작은수 = 최소공배수
        int small = n;
        int big = m;
        int tempNum = 0;

        while (small != 0){
             tempNum = big % small;
             big = small;
             small = tempNum;
             answer[0] = big;
        }

        answer[1] = (m / answer[0]) * n ;
        System.out.println(Arrays.toString(answer));
    }
}
