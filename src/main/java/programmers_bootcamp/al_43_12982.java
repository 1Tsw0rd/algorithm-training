package programmers_bootcamp;

import java.util.Arrays;

public class al_43_12982 { //https://school.programmers.co.kr/learn/courses/30/lessons/12982
    public static void main(String[] args) {
        //정렬해서 풀면 되지 않나
        int[] d = {2,2,3,3};
        int budget = 10;
        int answer = 0;

        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        int workNum = 0;
        for (int i : d) {
            budget -= i;
            workNum++;
            if (budget < 0) {
                workNum--;
                break;
            }
        }
        answer = workNum;
        System.out.println(answer);

    }
}
