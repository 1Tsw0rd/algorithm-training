package programmers_bootcamp;

import java.util.stream.Stream;

public class al_28_12947 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12947
    public static void main(String[] args) {
        //하샤드수 정수를 한자리씩 쪼개고
        //다 더하고
        //처음 정수에 합친 값 나눠서 0 이면 true, 아니면 false

        int x = 11;
        boolean answer = true;

        int sum = 0;
        int[] digit = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        for (int i : digit) {
            sum += i;
        }

        if (x % sum != 0) answer = false;

        System.out.println(answer);
    }
}
