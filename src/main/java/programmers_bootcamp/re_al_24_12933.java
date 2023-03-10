package programmers_bootcamp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class re_al_24_12933 { //https://school.programmers.co.kr/learn/courses/30/lessons/12933
    public static void main(String[] args) {
        //배열로 만들고, 정렬, 다시 문자열로
        long n = 118372;
        long answer = 0;

        //숫자 -> 문자열 -> 문자열 배열 -> 정렬 -> 문자열-> 숫자
        //https://school.programmers.co.kr/learn/courses/30/lessons/12934
        String strNum = String.valueOf(n);
        String[] strNumArr = strNum.split("");
        Arrays.sort(strNumArr, Comparator.reverseOrder());
        strNum = Arrays.stream(strNumArr).collect(Collectors.joining());

        answer = Long.parseLong(strNum);
        //System.out.println(strNum);



        System.out.println(answer);
    }
}


//        //배열로 만들고, 정렬, 다시 문자열로
//        long n = 118372;
//        long answer = 0;
//
//        //https://bangu4.tistory.com/287
//        //https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_%EC%9E%90%EB%A6%BF%EC%88%98_int_%EB%B0%B0%EC%97%B4%EC%9D%84_int%EB%A1%9C_%EB%B3%80%ED%99%98
//
//
//        int[] digit = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sorted().toArray();
//        Arrays.sort(digit);
//        Integer[] tmp = Arrays.stream(digit).boxed().toArray(Integer[]::new);
//        Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순
//
//        for (int tempDigit : tmp){
//            answer *= 10;
//            answer += tempDigit;
//        }
//
//        System.out.println(Arrays.toString(digit));
//        System.out.println(answer);
