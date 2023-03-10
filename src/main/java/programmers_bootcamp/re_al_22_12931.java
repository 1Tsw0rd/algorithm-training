package programmers_bootcamp;

import java.util.Arrays;
import java.util.stream.Stream;

public class re_al_22_12931 { //https://school.programmers.co.kr/learn/courses/30/lessons/12931
    public static void main(String[] args) {
        //정수형 기본타입(call by value)을 한 숫자씩 짤라서 다 더하면 됨
        int n = 123;
        int answer = 0;

        //https://junghn.tistory.com/entry/%EC%9E%90%EB%B0%94-int%EB%A5%BC-%EC%9E%90%EB%A6%BF%EC%88%98%EB%B3%84-int-%EB%B0%B0%EC%97%B4%EB%A1%9C-%EB%B6%84%ED%95%A0
        //https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_int%EB%A5%BC_%EC%9E%90%EB%A6%BF%EC%88%98_int_%EB%B0%B0%EC%97%B4%EB%A1%9C_%EB%B6%84%ED%95%A0
        //아래 Stream 부분 하나씩 분석해볼 필요 있음
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        System.out.print( Arrays.toString(digits) );

        for (int i = 0; i < digits.length; i++){
           answer += digits[i];
        }

        System.out.println(answer);
    }
}
