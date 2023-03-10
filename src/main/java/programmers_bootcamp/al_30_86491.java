package programmers_bootcamp;

import java.util.Arrays;

public class al_30_86491 { //https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30,70}, {60,30}, {80,40}};
        int answer = 0;

        int bigMax = 0;
        int smallMin = 0;

        for (int[] size : sizes) {
            System.out.println(Arrays.toString(size));
            bigMax = Math.max(bigMax, Math.max(size[0], size[1]));
            smallMin = Math.max(smallMin, Math.min(size[0], size[1])); //지갑 안에 집어넣야 되니까 max
        }
        answer = bigMax * smallMin;
        System.out.println(answer);
    }
}
