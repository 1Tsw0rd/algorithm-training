package programmers_bootcamp;

import java.util.Arrays;
import java.util.Comparator;

public class al_36_12917 { //https://school.programmers.co.kr/learn/courses/30/lessons/12917
    public static void main(String[] args) {
        //대문자, 소문자 구별 함수 필요
        //Character.isUpperCase() : 대문자이냐
        //Character.isLowerCase() : 소문자냐
        //Character.isDigit() : 문자냐
        String s = "Zbcdefg";
        String answer = "";

        //문자열 배열 전환
        String[] strArr = s.split("");
        System.out.println(Arrays.toString(strArr));

        //내림차순 정렬
        Arrays.sort(strArr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(strArr));

        //문자열로 합치기
        for (String s1 : strArr) {
            answer += s1;
        }
        System.out.println(answer);
    }
}
