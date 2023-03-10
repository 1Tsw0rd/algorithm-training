package programmers_bootcamp;

import java.util.Arrays;
import java.util.stream.Stream;

public class al_23_12932 { //https://school.programmers.co.kr/learn/courses/30/lessons/12932
    public static void main(String[] args) {
        //22번과 비슷
        long n = 12345;

        int[] digit = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        int[] answer = new int[digit.length];
        int digitSize = digit.length - 1;

        for(int i = digitSize, j = 0; i >= 0; i--, j++){
            //System.out.println(digit[i]);
            answer[j] = digit[i];
        }

        System.out.println(Arrays.toString(answer));

    }
}
