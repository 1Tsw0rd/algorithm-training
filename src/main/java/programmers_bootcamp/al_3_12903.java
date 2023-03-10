package programmers_bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_3_12903 { //https://school.programmers.co.kr/learn/courses/30/lessons/12903
    public static void main(String[] args) throws IOException {
        //문자열 길이 / 2 = 가운데 인덱스 추출
        //홀수라면 문자 1개(인덱스 값 반올림), 짝수라면 문자2개(인덱스 값 소수점 버린거, 반올림 같이 사용)
        //소수점 올림 함수 Math.round(값) 반올림, Math.ceil(값) 올림, Math.floor(값) 버림
        //문자열 자르기 함수 substring(위치), substring(시작위치, 끝위치 바로 다음 위치) 끝위치 직전까지 문자열 반환하기에..
        //성원 동기 말로는 끝위치 저 부분이 제외시킬 시작 인덱스

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int midIndex = s.length() / 2;

        if (s.length() <= 2) System.out.println(s);
        else if (s.length() % 2 == 0) {
            System.out.println(s.substring(midIndex - 1, midIndex + 1));
        } else System.out.println(s.substring(midIndex, midIndex + 1));
    }
}
